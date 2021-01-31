package org.example.zerholc.bst;

/*  Real World Applications
/   1. Hierarchical data: File systems, OS, game trees, machine learning
**/

public class Main {
    public static void main(String[] args) {
        ITree<Integer> intBst = new BST<>();
        intBst.insert(10);
        intBst.insert(5);
        intBst.insert(15);
        intBst.insert(3);
        intBst.insert(7);

        System.out.println(intBst.getMaxValue());
        System.out.println(intBst.getMinValue());
        intBst.inOrderTraversal();
        intBst.delete(10);
        intBst.inOrderTraversal();
        System.out.println("\n========================================");

        ITree<String> stringBst = new BST<>();
        stringBst.insert("Adam");
        stringBst.insert("Joe");
        stringBst.insert("Michael");
        stringBst.insert("Kevin");
        stringBst.insert("Staff");
        stringBst.insert("Daniel");

        System.out.println(stringBst.getMaxValue());
        System.out.println(stringBst.getMinValue());
        stringBst.inOrderTraversal();
        stringBst.delete("Kevin");
        stringBst.inOrderTraversal();
        System.out.println("\n========================================");

        ITree<Person> personBst = new BST<>();
        personBst.insert(new Person("Adam", 27));
        personBst.insert(new Person("Kevin", 13));
        personBst.insert(new Person("Joe", 67));
        personBst.insert(new Person("Michael", 2));
        personBst.insert(new Person("Smith", 11));
        personBst.inOrderTraversal();

    }
}
