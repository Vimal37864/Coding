package Exception.java;
import java.util.InputMismatchException;
import java.util.Scanner;

class Calc {
    void div() throws Exception {

        int a = 10 / 0;

    }
}
    class Mainclass {
        public static void main(String[] args) {
            Calc c =new Calc();
            try {
                c.div();
            }
            catch(Exception e) {
                System.out.println(e);


        }


        }
    }






