package org.example.a.ds.bst;

/*  Real World Applications
/   1. Hierarchical data: File systems, OS, game trees, machine learning
**/

public class Main {
    public static void main(String[] args) {
        intBstAnalyzed();
        stringBstWithHelpers();
        treeEquality();
        kthSmallestItem();
        sumAllTreeNodes();
    }

    public static void sumAllTreeNodes() {
        Questions<Person> questions = new Questions<>();
        MyTree<Person> personBst = new BstAnalyzed<>();
        personBst.insert(new Person("Adam", 47));
        personBst.insert(new Person("Kevin", 21));
        personBst.insert(new Person("Joe", 55));
        personBst.insert(new Person("Arnold", 20));
        personBst.insert(new Person("Noel", 34));
        personBst.insert(new Person("Marko", 68));
        personBst.insert(new Person("Susan", 23));
        personBst.insert(new Person("Rose", 38));
        System.out.println(questions.sumNodes(personBst.getRoot()));
    }

    public static void kthSmallestItem() {
        Questions<Integer> questions = new Questions<>();
        MyTree<Integer> intBst = new BstAnalyzed<>();
        loadTree(intBst);
        System.out.println(questions.getKthSmallestItem(intBst.getRoot(), 3));
    }

    public static void treeEquality() {
        Questions<Integer> questions = new Questions<>();
        MyTree<Integer> bst1 = new BstAnalyzed<>();
        MyTree<Integer> bst2 = new BstAnalyzed<>();
        loadTree(bst1);
        loadTree(bst2);
        System.out.println(questions.areTreesEqual(bst1.getRoot(), bst2.getRoot()));
    }

    public static void loadTree(MyTree<Integer> bst) {
        bst.insert(2);
        bst.insert(55);
        bst.insert(67);
        bst.insert(12);
        bst.insert(11);
    }

    public static void intBstAnalyzed() {
        System.out.println("INT BST");
        MyTree<Integer> intBst = new BstAnalyzed<>();
        intBst.insert(10);
        intBst.insert(5);
        intBst.insert(15);
        intBst.insert(3);
        intBst.insert(7);
        System.out.println("Min: " + intBst.getMin());
        System.out.println("Max: " + intBst.getMax());
        intBst.inOrderTraversal();
        intBst.delete(10);
        intBst.inOrderTraversal();
        System.out.println("\n========================================");
    }

    public static void stringBstWithHelpers() {
        System.out.println("STRING BST");
        MyTree<String> stringBst = new BstWithHelpers<>();
        stringBst.insert("Joe");
        stringBst.insert("Michael");
        stringBst.insert("Kevin");
        stringBst.insert("Adam");
        stringBst.insert("Louie");
        stringBst.insert("Daniel");
        System.out.println("Min: " + stringBst.getMin());
        System.out.println("Max: " + stringBst.getMax());
        stringBst.inOrderTraversal();
        stringBst.delete("Daniel");
        stringBst.inOrderTraversal();
        System.out.println("\n========================================");
    }
}
