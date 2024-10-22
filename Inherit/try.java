package Inherit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.HashMap;

class Delivery {
    private int id;
    private String location;
    private long timestamp;

    public Delivery(int id, String location, long timestamp) {
        this.id = id;
        this.location = location;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Delivery{id=" + id + ", location='" + location + "', timestamp=" + timestamp + "}";
    }
}

class DeliveryGroup {
    private String location;
    private List<Delivery> deliveries;

    public DeliveryGroup(String location) {
        this.location = location;
        this.deliveries = new ArrayList<>();
    }

    public String getLocation() {
        return location;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void addDelivery(Delivery delivery) {
        this.deliveries.add(delivery);
    }

    @Override
    public String toString() {
        return "DeliveryGroup{location='" + location + "', deliveries=" + deliveries + "}";
    }
}

public class DeliveryGrouper {
    private static final long FIVE_MINUTES_IN_MILLIS = 5 * 60 * 1000;

    public List<DeliveryGroup> groupDeliveries(List<Delivery> deliveries) {
        // First, sort the deliveries by location and timestamp
        deliveries.sort(Comparator.comparing(Delivery::getLocation)
                                  .thenComparing(Delivery::getTimestamp));

        List<DeliveryGroup> groupedDeliveries = new ArrayList<>();
        HashMap<String, DeliveryGroup> currentGroups = new HashMap<>();

        for (Delivery delivery : deliveries) {
            String location = delivery.getLocation();
            long timestamp = delivery.getTimestamp();

            // Check if we already have a group for this location
            DeliveryGroup currentGroup = currentGroups.get(location);

            if (currentGroup == null) {
                // Create a new group for this location
                currentGroup = new DeliveryGroup(location);
                currentGroup.addDelivery(delivery);
                groupedDeliveries.add(currentGroup);
                currentGroups.put(location, currentGroup);
            } else {
                // Check if the delivery can be added to the existing group (within 5 minutes)
                Delivery earliestDelivery = currentGroup.getDeliveries().get(0);
                if (timestamp - earliestDelivery.getTimestamp() <= FIVE_MINUTES_IN_MILLIS) {
                    currentGroup.addDelivery(delivery);
                } else {
                    // Create a new group for this location
                    DeliveryGroup newGroup = new DeliveryGroup(location);
                    newGroup.addDelivery(delivery);
                    groupedDeliveries.add(newGroup);
                    currentGroups.put(location, newGroup);
                }
            }
        }

        return groupedDeliveries;
    }

    public static void main(String[] args) {
        List<Delivery> deliveries = new ArrayList<>();
        deliveries.add(new Delivery(1, "LocationA", 1633096800000L)); // 10:00:00 AM
        deliveries.add(new Delivery(2, "LocationA", 1633097100000L)); // 10:05:00 AM
        deliveries.add(new Delivery(3, "LocationA", 1633097400000L)); // 10:10:00 AM
        deliveries.add(new Delivery(4, "LocationB", 1633096800000L)); // 10:00:00 AM
        deliveries.add(new Delivery(5, "LocationB", 163309740000
        