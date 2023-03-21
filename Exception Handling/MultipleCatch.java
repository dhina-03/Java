package exceptionHandling;

import java.util.InputMismatchException;

public class MultipleCatch {

    public static void main(String[] args) {


            int a[]=new int[5];
        try{

            System.out.println(a[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(InputMismatchException Ie)
        {
            System.out.println("InputMisMatch Exception occurs");
        }
        System.out.println("rest of the code");
    }
}