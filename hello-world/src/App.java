public class App {
    public static void main(String[] args) throws Exception {
//        System.out.println("Hello, World");
//        System.out.print("Hello, World!");
        //Do something

// int number = -5;
// System.out.println(number);

// long myLong = 5;
// System.out.println(myLong);

// double myDouble = 4.5;
// System.out.println(myDouble);

// float myFloat = (float) 4.5;
// System.out.println(myFloat);

// char myChar = '\u00A9';
// System.out.println(myChar);

// String name = "Masaya";
// System.out.println(name);

// boolean myBoolean = true;
// System.out.println(myBoolean);
        // int a = 5;
        // int b = 2;
        // double answer = (double) a + b;
        // System.out.println(answer);

        // String firstName = "Chaplin";
        // String lastName = "Charles";
        // String fullName = firstName + lastName;
        // System.out.println(fullName);
        // a++ ;
        // a++で1増やす　a--で1減らす
        int a = 0;
        int b = 2;

        // boolean answer = a != b;
        // System.out.println(answer);

        // boolean answer = a == 5 && b==2;
        // System.out.println(answer);
        boolean answer = a>3;
        // if (answer == true) {
        //     System.out.println("A is greater than 3");
        // } else {
        //     System.out.println("A is less than 3");
        // }
        // if (a>0) {
        //     System.out.println("A is Positive");
        // } else if (a<0) {
        //     System.out.println("A is Negative");
        // } else {
        //     System.out.println("A is Zero");
        // }
        switch (a) {
            case 1:
                System.out.println("A is One");
                break;
            case 2:
                System.out.println("A is Two");
                break; 
            case 3:
                System.out.println("A is Three");
                break;
            default:
                System.out.println("A is not One, Two or Three");
            
        }
        System.out.println("Continue...");


    }
}
