package day3;

import day2.Student;

public abstract class Department {

    int size ;
    public abstract int getDepartmentsize() ;
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        Department  vbudi = new Department() {
            @Override
            public int getDepartmentsize() {
                return 0;

            }
        };

    }
}
