public class Main {

//    //**1 CLASS: Try - Catch for calculation of area of parallelogram
//    public static class Parallelogram {
//        private float height;
//        private float breadth;
//
//        public Parallelogram(float height, float breadth) {
//            this.height = height;
//            this.breadth = breadth;
//        }
//
//        public float calcArea() throws Exception {
//            if (height <= 0 || breadth <= 0) {
//                throw new Exception("Breadth and height must be positive.");
//            }
//            return height * breadth;
//        }
//    }

//        //**2 STATIC
//        public static int H;
//        public static int B;
//        public static boolean flag = false;
//
//        public static boolean areValid() throws Exception {
//            if (H <= 0 || B <= 0) {
//                throw new Exception("Breadth and height must be positive");
//            }
//            return true;
//        }
//
//        static {
//            Scanner scanner = new Scanner (System.in);
//            H = scanner.nextInt();
//            B = scanner.nextInt();
//            try {
//                flag = areValid();
//            } catch (Exception e){
//                System.out.println(e);
//            }
//        }

//        //FUNCTION Calendar - GregorianCalendar: Return day from date.
//    public static String returnDay(int year, int month, int day) throws Exception {
//
//        Calendar cal = new GregorianCalendar(year, month, day);
//        int numDay = cal.get(Calendar.DAY_OF_WEEK);
//        switch (numDay) {
//            case 1:
//                return "MONDAY";
//            case 2:
//                return "TUESDAY";
//            case 3:
//                return "WEDNESDAY";
//            case 4:
//                return "THURSDAY";
//            case 5:
//                return "FRIDAY";
//            case 6:
//                return "SATURDAY";
//            case 7:
//                return "SUNDAY";
//            default:
//                throw new Exception ("Shouldn't be printing this...");
//        }
//    }

    public static void main(String[] args) {

//        //FUNCTION Calendar - GregorianCalendar: Return day from date.
//        Scanner scanner = new Scanner(System.in);
//        int month = scanner.nextInt() - 1;
//        int day = scanner.nextInt() - 1;
//        int year = scanner.nextInt();
//        try {
//            String date = returnDay(year, month, day);
//            System.out.println(date);
//        } catch (Exception e) {
//            System.out.println(e);
//        }


//        //Int to String
//        Scanner scanner = new Scanner(System.in);
//        int myInt = scanner.nextInt();
//        scanner.close();
//        String s = Integer.toString(myInt);
//        System.out.println(s);

//        //**2 STATIC
//        if(flag){
//            int area=B*H;
//            System.out.print(area);
//        }


//        //**1 CLASS: Try - Catch for calculation of area of parallelogram
//        Scanner scanner = new Scanner(System.in);
//        float height = scanner.nextFloat();
//        float breadth = scanner.nextFloat();
//        Parallelogram parallelogram = new Parallelogram(height, breadth);
//        try {
//            float result = parallelogram.calcArea();
//            System.out.println(result);
//        } catch (Exception e) {
//            System.out.println(e);
//        }

//        //Duplicate input text until EOF
//        try {
//
//            ArrayList<String> s = new ArrayList<String>();
//            Scanner scanner = new Scanner(System.in);
//            int i = 1;
//            while (scanner.hasNextLine()) {
//                s.add(scanner.nextLine());
//                System.out.printf("%d %s%n", i, s.get(i-1));
//                i++;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        //File IO
//        try {
//            File file = new File("/Users/darg/projects/java/IJ/DataStructures/text.txt");
//            Scanner scanner = new Scanner(file);
//            int i = 1;
//            while (scanner.hasNextLine()) {
//                String s = scanner.nextLine();
//                System.out.printf("%d. %s%n", i, s);
//                i++;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        //Array implementation test
//        int[] intArray = new int[10];
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = i;
//        }
//        ArrayImplementation.printIntArray(intArray);
//        intArray = ArrayImplementation.addToTail(intArray, 100);
//        ArrayImplementation.printIntArray(intArray);
//        intArray = ArrayImplementation.addToHead(intArray, 100);
//        ArrayImplementation.printIntArray(intArray);
//
//        intArray = ArrayImplementation.removeFromTail(intArray);
//        ArrayImplementation.printIntArray(intArray);
//        intArray = ArrayImplementation.removeFromTail(intArray);
//        ArrayImplementation.printIntArray(intArray);
//        intArray = ArrayImplementation.removeFromHead(intArray);
//        ArrayImplementation.printIntArray(intArray);
    }
}

