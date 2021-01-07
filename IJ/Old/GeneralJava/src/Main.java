class LinkedList {
    private Node head;
    private int length = 0;

    static class Node {
        private Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            next = null;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


    public LinkedList() {
        this.head = new Node(null);
    }

    public int size() {
        return length;
    }

    public void add(Object data) {
        Node node = new Node(data);
        Node iterator = head;
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
        length++;
    }

    public Object get(int index) {
        if (head.getNext() == null || index >= length) {
            return null;
        }

        Node iterator = head.getNext();
        int counter = 0;
        while (counter < index) {
            iterator = iterator.getNext();
            counter++;
        }
        return iterator.getData();
    }

    public int indexOf(Object data) {
        Node node = head;
        for (int i = 0; i < length; i++) {
            node = node.getNext();
            if (node.getData().equals(data)) {
                return i;
            }
        }
        return -1; //Throws exception "data not found"
    }

    public boolean remove(Object data) {
        if (head.getNext() == null) {
            return false;
        }

        Node iterator = head;

        while (iterator.getNext() != null) {
            if (iterator.getNext().getData().equals(data)) {
                iterator.setNext(iterator.getNext().getNext());
                length--;
                return true;
            }
            iterator = iterator.getNext();
        }
        return false;
    }


}

class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list.size());
        System.out.println(list.get(0));
        Object object = new Object();
        list.add(object);
        System.out.println(list.size());
        System.out.println(list.get(0));

        testPackage.TestClass.main();
        testPackage.anotherPackage.AnotherTestClass.main();
    }
}

