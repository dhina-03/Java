class Animal1{
    void eat(){System.out.println("eating...");}
}
class Dog1 extends Animal1{
    void bark(){System.out.println("barking...");}
}
class Cat extends Animal1{
    void meow(){System.out.println("meowing...");}
}
class HierachicalInheritance{
    public static void main(String args[]){
       // Dog1 d = new Dog1();
        Cat c=new Cat();
        c.meow();
        c.eat();
       // d.bark();

    }}  