public class HwProg17  { // Global area

    String city = "Northampton"; // Instance variable
    static String country = "UK"; // Static variable


    public void Co(){ //Instance method and instance method called static variable in print statement
        System.out.println(country);
    }
    public static void Ci(){ // Static method and in static method called instance variable in print statment
        HwProg17 CN = new HwProg17();
        System.out.println(CN.city);
    }
    public static void main(String[] args) { //main method and in main method have called user difned method
        HwProg17 CN = new HwProg17();
     Ci();
        CN.Co();

    }
}
