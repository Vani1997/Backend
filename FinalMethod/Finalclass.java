package FinalMethod;

final class FinalClass {
   protected int finalVariable = 10;

    protected int finalMethod() {
       return finalVariable;
    }
    public static void main(String args[]) {
        FinalClass f = new FinalClass();
        System.out.println("This is a final method  "  + f.finalMethod());
    }
}

