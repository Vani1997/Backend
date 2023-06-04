package day3;

public class Vehicle {
    public void wheels() {

        }
    }
    class Car extends Vehicle {
        @Override
        public void wheels() {
            System.out.println("car has");
        }
    }


    class  Bus extends Vehicle {
        @Override
        public void wheels() {
            System.out.println("bus has");
        }
    }


    class RuntimePolymorphismExample {
        public static void main(String[] args) {
            Vehicle audi = new Car();
            Vehicle volvo= new Bus();

            audi.wheels();
            volvo.wheels();
        }
    }







