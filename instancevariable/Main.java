package instancevariable;

public class Main {
    public static void main(String[] args) {
        Child child1 = new Child(10, 20);
        System.out.println("Child1 - Parent Variable: " + child1.parentVariable);
        System.out.println("Child1 - Child Variable: " + child1.childVariable);

        Child child2 = new Child(30);
        System.out.println("Child2 - Parent Variable: " + child2.parentVariable);
        System.out.println("Child2 - Child Variable: " + child2.childVariable);
    }
}
