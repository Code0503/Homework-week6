public class HwProgramme2 { // two static variables in global area

    static String name = "Nim";
    static String lastname = "Pat";

    public static void nl() { // created one static method
        System.out.println(name);  // call both static variables insied print statment
        System.out.println(lastname);
    }

    public static void main(String[] args) {  //above static method in main method
        nl();
    }
}
