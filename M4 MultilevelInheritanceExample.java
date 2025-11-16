public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        // Creating object of subclass (Puppy)
        Puppy p = new Puppy();

        // Accessing methods from all parent classes
        p.eat();  // from Animal class
        p.bark(); // from Dog class
        p.weep(); // from Puppy class
    }
}

// Parent class (Super class)
class Animal {
    void eat() {
        System.out.println("Animals can eat");
    }
}

// Intermediate class (Child of Animal, Parent of Puppy)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog can bark");
    }
}

// Child class (Grandchild of Animal)
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy can weep");
    }
}
