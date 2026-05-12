package Exception.java;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int age = sc.nextInt();
            if (age<1)
            {
                throw new ArithmeticException("age should be in greater than one 1");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }



    }

}
