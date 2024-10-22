import java.util.ArrayList;

public class function {
    private ArrayList<Calculate> calculates;

    public function() {
        calculates = new ArrayList<>();
    }

    public void displaynumbers() {
        if (calculates.isEmpty()) {
            System.out.println("\nno number");
        }
        for (Calculate cal : calculates) {
            System.out.println("\n" + cal);

        }
    }
}
