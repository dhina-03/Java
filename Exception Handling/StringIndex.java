package exceptionHandling;

public class StringIndex {
    public static void main(String[] args) {
        String s="Dhina";
        try {
            System.out.println(s.charAt(6));
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Check String Index Number");
        }
    }
}
