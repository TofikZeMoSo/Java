public interface CycleInterf {
    int numberOfTyres();
}

class NewUnicycle implements CycleInterf {
    int tyres = 1;
    public int numberOfTyres() {
        return tyres;
    }
}

class NewBicycle implements CycleInterf {
    int tyres = 2;
    public int numberOfTyres() {
        return tyres;
    }
}

class NewTricycle implements CycleInterf {
    int tyres = 3;
    public int numberOfTyres() {
        return tyres;
    }
}

class CycleFactory {
    public CycleInterf createNewCycle(String tyres) {
        if(tyres == null || tyres.isEmpty())
            return null;
        if("One".equals(tyres))
            return new NewUnicycle();
         else if("Two".equals(tyres))
            return new NewBicycle();
         else if("Three".equals(tyres))
            return new NewTricycle();
            return null;
    }
}

class BuyACycle {
    public static void main(String[] args) {
        CycleFactory cyclefactory = new CycleFactory();
        CycleInterf newCycle = cyclefactory.createNewCycle("Two");
        System.out.println(newCycle.numberOfTyres());
    }
}
