public class HwProg11 { /*Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output: 2.138888888888889*/
    public static void main(String[] args) {

B(25.5,3.5,40.5,4.5);

    }
public static void B (double a,double b, double c,double d){

    System.out.println((a*b-b*b)/(c-d));
}

}
