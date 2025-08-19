    //SumOfUserNums.java
    //rVE 08/19/25

    //References:
    // Used to learn user input
    // https://www.w3schools.com/java/java_user_input.asp

    // I need to import the scanner class from the java.util package
    // - this is how to do that.

    import java.util.Scanner;

    public class SumOfUserNums {
        public static void main(String[] args) {
            System.out.println("\n\n Welcome to my Sum of user program... \n\n");
            // Get 3 ints from the user and output the sum of ints

            //Create the variables needed
            int num1 = 11;
            System.out.println("\n The value of num1 is " + num1 + "\n");

            int num2 = 22;
            int num3 = 33;
            int sumOfTheInts =0;


            // get user input
            // Create a Scanner object named scanner
            Scanner scanner =  new Scanner(System.in);
            // Get the first int.
            System.out.println("\n Enter an integer for num1: ");
            num1 = scanner.nextInt();

            System.out.println("\n Enter an integer for num2: ");
            num2 = scanner.nextInt();
            System.out.println("\n Enter an integer for num3: ");
            num3 = scanner.nextInt();

            // Test it
            System.out.println("\n num1 is: " + num1);
            System.out.println("\n num1 is: " + num2);
            System.out.println("\n num1 is: " + num3);

            //add them up
            sumOfTheInts = num1 + num2 + num3;

            //Test
            System.out.println("\n The sum of the ints is: " + sumOfTheInts);

            System.out.println("\n This is the end of my program.");

        }
}
