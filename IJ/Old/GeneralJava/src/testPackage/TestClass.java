package testPackage;

class theClass {
    private int intValue;

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public theClass(int intValue) {
        this.intValue = intValue;
    }
}

public class TestClass {
    public static void main() {
        Integer[] myIntArray = new Integer[10];
        theClass[] myClass = new theClass[10];
        System.out.println(myClass[0]);
        System.out.println(myIntArray[0]);
    }
}
