package exceptionHandling;

public class NullPointer {
    public static void main(String[] args) {
        String S=null;
        try {
            System.out.println(S.length());
        }catch (NullPointerException e){
            System.err.println("Null POinter Exception");
        }
    }
}
