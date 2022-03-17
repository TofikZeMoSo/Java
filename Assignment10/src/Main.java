public class Main {
    public static void main(String[] args) {
        SList<Integer>  list = new SList<>();

        SListIterator <Integer> listIterator = list.iterator();

////        listIterator.add(1);
//        listIterator.add(4);
//        listIterator.add(8);
//        listIterator.add(12);
        // listIterator.add(14);
        listIterator.add(16);
        listIterator.printList();
        listIterator.remove(5);
        listIterator.printList();
        listIterator.insert(4,7);



        listIterator.printList();
    }
}
/*
Generics mean parameterized types. The idea is to allow type (Integer, String, … etc, and user-defined types)
to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types.
An entity such as class, interface, or method that operates on a parameterized type is called a generic entity.
 */

