public class HwProg18 {
    /*18.1 Declare your council name as static variables.
18.2 Declare your house number as instance variables.
18.3 Declare one instance method name borough() and call Static variable
18.4 Declare static method name address() and call instance variable
18.5 Call both user defined methods into main method.*/

    static String council = "Northamtonshire Council"; // Static variable
    String houseNo = "House 22A"; // Instance variable

    public void borough(){ //Instance method and instance method called static variable in print statement
        System.out.println(council);
    }
    public static void address(){ // Static method and in static method called instance variable in print statment
        HwProg18 CH = new HwProg18();
        System.out.println(CH.houseNo);
    }
    public static void main(String[] args) { //main method and in main method have called user difned method
        HwProg18 CH = new HwProg18();
        address();
        CH.borough();


    }
}
