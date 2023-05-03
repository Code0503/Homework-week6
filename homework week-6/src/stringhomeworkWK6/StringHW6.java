package stringhomeworkWK6;

public class StringHW6 { /*Write a java program which replace a “I@love@java” to “we love java”
Expected output: We love java*/
    public static void main(String[] args) {
        String a = "I@love@java";
        System.out.println(a.replaceAll("I@love@java","We love java"));
    }
}
