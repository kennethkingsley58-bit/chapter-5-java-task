public class TrianglePrinting{
    public static void main(String[] args){

       
        for (int index = 1;  index <= 10;  index++){
          for (int line  = 1; line <= index; line++) {
            System.out.print('*');
            }
            System.out.println();
                 }

       
                for (int index = 10; index >= 1; index--){
                  for (int line = 1; line <= index; line++) {
                    System.out.print('*');
                    }
                    System.out.println();
               }

                for (int index = 10; index >= 1; index--){

                    for (int line = 1; line <= 10 - index; line++) {
                        System.out.print(' ');
                          }

                    for (int line = 1; line <= index; line++) {
                        System.out.print('*');
                         }

                           System.out.println();
                                }
          
                for (int index = 1; index <= 10; index++) {

                           for (int line = 1; line <= 10 - index; line++) {
                                 System.out.print(' ');
                             }

             for (int line = 1; line <= index; line++) {
                    System.out.print('*');
                }

                          System.out.println();
    }
}
}
