class Animal2 {
    void fly() {
        System.out.println("I am FLying");
    }
}
    class Bird extends Animal2{
        void walk(){
            System.out.println("I am walking");
        }
        void sing(){
            System.out.println("I am singing");
        }
    }
public class InheritancePrblm1 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.walk();
        bird.sing();

    }
}
