public class HwProg19 {
    /*19.1 Declare one of your group member names as instance variable.
19.2 Declare one of your group member names as static variable.
19.3 Declare one instance method name with group name (e.g. selenium())and call both global
variables.
19.4 Declare static method name agile() and call both variable
19.5 Call both user defined methods into main method.
Note: Declare 1 local variables in all user defined method and main method and print in to statement*/
    String name1 = "Kruti";
    static String name2 = "Shweta";

    public void JAVA() {
        System.out.println(name1);
        System.out.println(name2);

    }
    public static void agile(){
        HwProg19 ja = new HwProg19();
        System.out.println(name2);
        System.out.println(ja.name1);

    }

    public static void main(String[] args) {
        HwProg19 ja = new HwProg19();
        agile();
        ja.JAVA();
    }

}
