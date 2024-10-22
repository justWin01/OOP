package Inherit;

public class Anak {
    public static void main(String[] args) {
        Mama m = new Mama();
        System.out.println(m.Speak());
        System.out.println("ito yung pera bili mo nang sardenas!!" + m.pera());
    }
}
