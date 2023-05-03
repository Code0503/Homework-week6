public class HwProgramme3 { // global area

    String name = "Nim"; //instace veriable
    static int b = 05; // static veriable

    public void n(){  // created instace method
        System.out.println(name);  // instance veriable in print statment

    }
    public static void is() {  // created static method
        System.out.println(b); // static veriable into pint statment
    }

    public static void main(String[] args) {  // main method
        HwProgramme3 H3 = new HwProgramme3(); // created object for instance method
        System.out.println(b);  // static variable in print statment as main method is static so called it directly
        H3.n();   // print object directly without sout statment

    }

}
