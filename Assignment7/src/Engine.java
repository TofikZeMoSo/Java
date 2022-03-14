public interface Engine {
    int power(int hp);
    void typeOfEngine();
}

interface Brakes {
    int resistantPower(int rp);
    void typeOfBrakes();
}

interface GearBox {
    int numberOfGears(int numGear);
    void typeOfGearBox();
}

interface Car extends Engine, Brakes, GearBox {
    void companyOfCar();
}

class Brand {
    void nameOfCar() {
        System.out.println("Car Brand");
    }
}

class TypeOfCar extends Brand implements  Car {

    public int power(int a) {
        return a;
    }

    public void typeOfEngine() {
        System.out.println("Engine Type");
    }

    public int resistantPower(int b) {
        return b;
    }

    public void typeOfBrakes() {
        System.out.println("Type Of Brakes :Hydrolics");
    }

    public int numberOfGears(int c) {
        return c;
    }

    public void typeOfGearBox() {
        System.out.println("Gear Box");
    }

    public void companyOfCar() {
        System.out.println("Car Company :Honda");
    }
}

class CarMain {
    public static void Honda(Engine engine) {
        System.out.println("The horse power is :" + engine.power(1200));
    }

    public static void Suzuki(Brakes brakes) {
        brakes.typeOfBrakes();
    }

    public static void Tata(GearBox gear) {
        System.out.println("The Number Of Gears :" +gear.numberOfGears(6));
    }

    public static void Toyota(Car car) {
        car.companyOfCar();
    }

    public static void main(String[] args) {
        TypeOfCar TC = new TypeOfCar();
        Honda(TC);
        Suzuki(TC);
        Tata(TC);
        Toyota(TC);

    }
}