import java.util.Scanner;

public class BarChartPrinting{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
       
                for (int index = 0; index < 5; index++){
                    System.out.print("Enter a number 1-30:  ");
                    numbers[index] = input.nextInt();
                     }

        for (int index = 0; index < 5; index++){

            for (int line = 0; line < numbers[index]; line++){
                System.out.print('*');
                     }
    
            System.out.println();
}
}
}
