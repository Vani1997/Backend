package day2;

public class Student {
    String name;


    public String getName(){
        return name;

    }

   public void setName(String name){
         this.name= name;
         return;
    }
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        Student vbudi = new Student();
        System.out.println("what is your name ="+ vbudi.getName());
        vbudi.setName("vaani");
        System.out.println("what is your name ="+ vbudi.getName());
    }
}

