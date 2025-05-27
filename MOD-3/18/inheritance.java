// Base class
class Animal {
    // Method to make a sound
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass that inherits from Animal
class Dog extends Animal {
    // Override makeSound method
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Create an Animal object
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();  // Output: Animal makes a sound

        // Create a Dog object
        Dog dog = new Dog();
        dog.makeSound();  // Output: Bark
    }
}
