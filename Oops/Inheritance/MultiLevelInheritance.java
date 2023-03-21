class Animal{
    void eat(){
        System.out.println("food");
    }
}
class Dog extends Animal{
    void sounds(){
        System.out.println("bow bow");
    }
}
class BabyDog extends Dog{
    void noise(){
        System.out.println("Weeping");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        BabyDog p1=new BabyDog();
        p1.noise();
        p1.sounds();
        p1.eat();
    }
}
