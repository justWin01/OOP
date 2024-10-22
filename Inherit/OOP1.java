package Inherit;

abstract class Sound {
    public abstract void sound();

    public void soundoff() {
        System.out.println("Sound Off");
    }
}

class Car1 extends Sound {
    @Override
    public void sound() {
        System.out.println("Car1 is on");
    }
}

class Car02 extends Sound {
    @Override
    public void sound() {
        System.out.println("Car2 is on");
    }
}

class OOP1 {
    public static void main(String[] args) {
        Car1 car = new Car1();
        Car02 car02 = new Car02();

        car.sound();
        car.soundoff();

        car02.sound();
        car02.soundoff();
    }
}
