public class Cycle {
    void balance() {
        System.out.println("I am Cycle balance class");
    }
    }

class Unicycle extends Cycle {
    void balance() {
        System.out.println("Unicycle needs balancing");
    }
}

class Bicycle extends Cycle {
    void balance() {
        System.out.println("Bicycle also needs balancing");
    }
}

class Tricycle extends Cycle {
    void noNeedBalance() {
        System.out.println("It does not need balancing");
    }
}

class CycleMain {
    public static void main(String [] args) {
        Cycle[] C = new Cycle[3];
        C[0] = new Unicycle();
        C[1] = new Bicycle();
        C[2] = new Tricycle();

        C[0].balance();
        C[1].balance();
        C[2].balance();

        Unicycle uni = (Unicycle) C[0];
        Bicycle bi = (Bicycle) C[1];
        Tricycle tri = (Tricycle) C[2];
        uni.balance();
        bi.balance();
        tri.balance();
    }
}