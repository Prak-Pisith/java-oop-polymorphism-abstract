class Main {
    public static void main(String[] args) {
        System.out.println("Polymorphism - Abstraction");
//        Object obj = new Object();
//        System.out.println(obj.toString());

        Dog dog1 = new Dog();
        dog1.move();
        dog1.bark();

        Animal obj1 = new Animal();
        obj1.move();
//        obj1.bark();

        Dog dog2 = new Dog();
        dog2.beFriend();
        dog2.play();
    }
}

class Animal {
//    private String name;
//    private String age;
    public void move() {
        System.out.println("Object is moving ...");
    }
}

// Additional behaviors for Pet
// Dog and Cat should implement
// Tiger and Lion should not implement (optionally)
interface Pet { // Additional
    public abstract void beFriend();
    public abstract void play();
}

class Dog extends Animal implements Pet {
    public void bark() {
        System.out.println("Dog is barking ...");
    }

    @java.lang.Override
    public void beFriend() {
        System.out.println("Dog is be friend");
    }

    @java.lang.Override
    public void play() {
        System.out.println("Dog is playing ...");
    }
}