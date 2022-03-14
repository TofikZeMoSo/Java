public abstract class Rodents {
    abstract void size();
    abstract void eat();
}

class mouse extends Rodents {
    mouse () {
        System.out.println("I am Mouse");
    }
   void size() {
        System.out.println("Very Small in size");
    }
    void eat() {
        System.out.println("I eat crops and remained food");
    }
}

class gerbil extends Rodents {
    gerbil() {
        System.out.println("I am Gerbil");
    }
    void size() {
        System.out.println("Medium in size with long tail");
    }
    void eat() {
        System.out.println("I eat crops and peanut seeds");
    }
}

class hamster extends Rodents {
    hamster() {
        System.out.println("I am Hamster");
    }

    void size() {
        System.out.println("Very small in size");
    }
    void eat() {
        System.out.println("I eat meat,grass and insects");
    }
}

class main {
    public static void main(String [] args) {
        Rodents[] rodentsArray = new Rodents[3];


        rodentsArray[0] = new mouse();
        rodentsArray[1] = new gerbil();
        rodentsArray[2] = new hamster();

        rodentsArray[0].size();
        rodentsArray[0].eat();

        rodentsArray[1].size();
        rodentsArray[1].eat();

        rodentsArray[2].size();
        rodentsArray[2].eat();
    }
}