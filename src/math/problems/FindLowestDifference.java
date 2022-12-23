package math.problems;
import java.lang.*;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        int lowest;

        lowest = lowestDiff(array1,array2);

        System.out.println(lowest);




    }
    public static int lowestDiff(int [] a, int [] b){
        int lowest=Math.abs(a[0]-a[1]);
        int lowest2=Math.abs(b[0]-b[1]);
        int temp;
        int temp2;

        for(int i=0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                temp=Math.abs(a[i]-a[j]);
                if(temp<lowest)
                    lowest=temp;
                //System.out.print(i+"-"+j+" = "+lowest+", ");

            }
        }
       //System.out.println("\n---------------------------------------");
        for(int i=0;i<b.length;i++){
            for(int j =i+1;j<b.length;j++){
                temp2=Math.abs(b[i]-b[j]);
                if(temp2<lowest2)
                    lowest2=temp2;
              //System.out.print(i+"-"+j+" = "+lowest2+", ");

            }
        }

        if(lowest<lowest2)
            return lowest;

        return lowest2;
    }


}
