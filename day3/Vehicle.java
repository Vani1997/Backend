package day3;

public class Vehicle {


        public void wheels() {

        }
    }

    // Child class
    class Car extends Vehicle {
        @Override
        public void wheels() {
            System.out.println("car has");
        }
    }

    // Child class
    class  Bus extends Vehicle {
        @Override
        public void wheels() {
            System.out.println("bus has");
        }
    }

    // Main class
    class RuntimePolymorphismExample {
        public static void main(String[] args) {
            Vehicle audi = new Car();
            Vehicle volvo= new Bus();

            audi.wheels(); // Calls the overridden method in the Circle class
            volvo.wheels(); // Calls the overridden method in the Square class
        }
    }







