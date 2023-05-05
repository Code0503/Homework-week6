package practiceHomeworkWeek6;

public class N10 {/*Write a Java program that takes a number as input and prints its multiplication
table up to 10.
Test Data: Input a number: 8.
Expected Output:
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 10 = 80*/
    public void table(int a,int b){
        System.out.println(a +"*"+b+"="+(a*b));
    }

    public static void main(String[] args) {
        N10 A = new N10();
        A.table(8,1);
        A.table(8,2);
        A.table(8,3);
        A.table(8,4);
        A.table(8,5);
        A.table(8,6);
        A.table(8,7);
        A.table(8,8);
        A.table(8,9);
        A.table(8,10);
    }

}
