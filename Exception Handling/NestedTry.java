package exceptionHandling;

public class NestedTry {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 20;

            try {
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException e) {
                System.out.println("Inner catch: NullPointerException");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Outer catch: Exception");
        }
        finally {
            System.out.println("Program continues...");
        }

    }
}
