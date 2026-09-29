import java.util.Scanner;

    public class CompoundInterest{
         public static void main(String[] args){
    
             Scanner input = new Scanner(System.in);

                System.out.print("Enter principal amount: ");
                double principalAmount = input.nextDouble();

                System.out.print("Enter the years: ");
                int years = input.nextInt();

                 System.out.println("The Rate = The Amount");

        for (int rate = 5; rate <= 10; rate++) {

            double amount = principalAmount * Math.pow(1 + rate / 100.0, years);

            System.out.println(rate + "%    " + amount);
            }
}
} 
