public class HwProgramme1 {  //created 2 intance veiables in global area
    String name = "Nim";
    String lastname = "Patel";

    public void nl() {     // both instance variables into the instance method inside the print statment in local area
        System.out.println(name);
        System.out.println(lastname);

    }

    public static void main(String[] args) { // called instance method into main method and run sout
        HwProgramme1 n1 = new HwProgramme1();
        n1.nl();
    }


    }






