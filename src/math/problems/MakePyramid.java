package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

        int layers = 6;


        for(int i= 0;i<layers;i++) {

            for(int s=0;s<layers-i;s++) {
                System.out.print(" ");

            }
            for(int j=0;j<i+1;j++) {
                System.out.print("* ");
            }
            System.out.print("\n");

        }


        }
  }
