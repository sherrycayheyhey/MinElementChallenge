import java.util.Scanner;

public class Main {

    private static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {


        //read the count from the console
        System.out.println("enter count");
        int userCount = myScanner.nextInt();
        myScanner.nextLine();
        //call readIntegers() with the count parameter
        int[] enteredArray = readIntegers(userCount);
        //call findMin() with the returned array
        int min = findMin(enteredArray);
        //print the minimum element
        System.out.printf("the minimum is " + min);
    }

    //takes in the count of how many integers the user has to enter
    //reads from the console until all the numbers are entered
    //returns the array
    public static int[] readIntegers(int count) {
        int[] userArray = new int[count];
        System.out.println("enter " + count + " integers");
        for(int i=0; i<userArray.length; i++) {
            userArray[i] = myScanner.nextInt();
            myScanner.nextLine();
        }
        return userArray;
    }

    //takes the array created by the user
    //evaluates the array to find the lowest value
    //returns the lowest value
    public static int findMin(int[] array) {
        int minimum = Integer.MAX_VALUE; //clever trick!
        for(int i=0; i<array.length; i++) {
            if(array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }
}
