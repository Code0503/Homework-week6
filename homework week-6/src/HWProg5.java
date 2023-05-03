public class HWProg5 { //global area
 static    int a = 2, b = 3, c = 4, d = 5; // static variables


 String ad = "addition is "; // string variables
 String su = "substraction is "; // string variables
 String mu = "multiplication is "; // string variables
 String di = "division is "; // string variables

 public static void as(){ // local static method
     System.out.println(a+b);
     System.out.println(d-c);
 }
 public void md(){ // local string method
     System.out.println(mu + (a*b));
     System.out.println(di + (c/a));
 }

    public static void main(String[] args) { // main method

     HWProg5 p5 = new HWProg5(); // created object

        System.out.println(p5.ad + (a+b)); // print
        System.out.println(p5.su + (d-c));
        System.out.println(p5.mu + (a*b));
        System.out.println(p5.di + (c/a));
    }


}
