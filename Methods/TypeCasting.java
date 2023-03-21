import java.awt.geom.Arc2D;

public class TypeCasting {
    public static void main(String[] args) {
        int n=3000;
        long n1=n;
        double n2=n1;
        System.out.println(n2); // Automatic or Implicit

        double d=4000.0;
        long d2= (long) d;
        System.out.println(d2); // Manual or Explicit

        int s = 20;
        float f=s;
        System.out.println(f);

        float f1= 34.0F;
        int f4=(int) f1;
        System.out.println(f4);

        int a=296;
        byte b=(byte) a;
        System.out.println(b);


    }
}
