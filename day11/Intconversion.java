package day11;

public class Intconversion {
    static String s;
    public Intconversion(String s){

        this.s=s;
    }
     public  int test()
     {
        return Integer.parseInt(s);
    }
    public static void main(String[] arg){
        try{
         Intconversion i=new Intconversion("23");
         System.out.println("converted string "+ s +" to" +i.test());
        }
        catch(NumberFormatException e){
            System.out.println("cannot convert" + s+"to int");
        }

    }

}
