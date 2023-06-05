package Static;
public class Bike {
     static int speed;

    static {
        speed = 90;
    }

    static int Bullet() {
        return speed;
    }

    public static void main(String args[]) {
        System.out.println(Bike.Bullet());
    }
}



