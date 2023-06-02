package day3;

public class Eee extends Department {

    @Override
    public int getDepartmentsize() {
        return 164;
    }
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        Department  vbudi = new Eee();
        System.out.println("deparment size is " + vbudi.getDepartmentsize());


    }
}
