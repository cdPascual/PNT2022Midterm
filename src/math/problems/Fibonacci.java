package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int firstNum = 0;
        int secondNum =1;
        int thirdNum = firstNum+secondNum;


        System.out.print(firstNum+", "+secondNum);

        for(int i =0;i<38;i++){
            thirdNum=firstNum+secondNum;
            System.out.print(", "+thirdNum);
            firstNum=secondNum;
            secondNum=thirdNum;
        }
        System.out.print("\n");


    }
}
