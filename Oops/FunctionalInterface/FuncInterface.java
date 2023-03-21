interface Class1{
    int calculate(int a,int b);
}
public class FuncInterface {
    public static void main(String[] args) {
        Class1 c1= (int a,int b) -> a+b;
        int result = c1.calculate(2,3);
        System.out.println(result);
    }
}







/*interface  Class1{
    int calculate(int a, int b);
}
 class Class2 implements Class1{
    public int calculate(int a,int b){
        return a+b;
    }
}
public class FuncInterface {
    public static void main(String[] args) {
        Class2 c2=new Class2();
      //  c2.calculate(3,2);
        System.out.println(c2.calculate(3,2));
    }
}*/