/*class Addition{
    static int add(int a , int b){
        return (a+b);
    }
    static int add(int a,int b,int c){
        return (a+b+c);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(Addition.add(11,10));
        System.out.println(Addition.add(10,20,50));
    }
}*/
class Addition{
     static int add(int a , int b){
        return (a+b);
    }
    static int addDouble(int a,int b , int c){
        return (a+b+c);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(Addition.add(11, 10));
        System.out.println(Addition.addDouble(10, 20, 40 ));
    }
}