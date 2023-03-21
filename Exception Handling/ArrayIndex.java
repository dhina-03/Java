package exceptionHandling;

public class ArrayIndex {
    public static void main(String[] args) {
        int[] a=new int[4];
        try{
            System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Check Index Number");
        }


    }
}
