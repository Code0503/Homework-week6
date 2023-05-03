public class HwProg4 { //global area
    char In = 'D';  // string variable
    String ln= "Patel"; // string variable
   static int DOB = 21; // static variable
    static int year = 2014; // static variable

    public void il(){  // local area of sting method
        System.out.println(In); // print statment of string variable
        System.out.println(ln); // print statment of string variable
    }

    public static void dy(){ // local area of static method
        System.out.println(DOB); // print statment of static method
        System.out.println(year); // print statment of static method
    }

    public static void main(String[] args) { // main method
        HwProg4 P4 = new HwProg4(); // created object of class
        P4.il(); //print statment for string using object
        dy(); // print statment for static using static method name
        System.out.println(P4.In); // print value of In and ln, done just for parctice for both lines
        System.out.println(P4.ln);
    }

}
