public class HwProg20 {
    /*20.1 Declare your Spain as static variable.
20.2 Declare your United Kingdom as instance variable.
20.3 Declare instance method name homeCountry()and call static variable.
20.4 Declare static method name holidays() and call instance variable
20.5 Call both methods in main method.*/

    static String country = "Spain";
    String hC = "United Kingdom";

    public static void holiday() {
        System.out.println(country);
    }

    public void homeCountry() {
        System.out.println(hC);

    }

    public static void main(String[] args) {
        HwProg20 h2 = new HwProg20();
        holiday();
        h2.homeCountry();

    }
}
