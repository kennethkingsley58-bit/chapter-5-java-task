import java.util.Scanner;

    public class Extremes{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("How many Numbers you want? ");
    int numbers = input.nextInt();

     if (numbers <= 0) {
            System.out.println("Enter a number greater than 0: ");
            return;
        }
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        
        for (int count = 1; count <= numbers; count++) {
            System.out.println("Enter integer " + count + ": ");
            int numberOne = input.nextInt();

            if (numberOne < minimum) {
                minimum = numberOne;
                }
                if (numberOne > maximum) {
                    maximum = numberOne;
            }
        }
         int extremeSum = minimum + maximum;
         
        System.out.println("Minimum number: " + minimum);
        System.out.println("Maximum number: " + maximum);
        System.out.println("Sum of the two extremes is: " + minimum + " + " + maximum + " = " + extremeSum);
              }
        }
