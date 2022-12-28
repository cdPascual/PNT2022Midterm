package math.problems;

import org.junit.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        int[] fLDA={30,12,5,9,2,20,33,1};
        int[] fLDB= {18,25,41,47,17,36,14,19};
        int [] fMN = {10, 2, 1, 4, 5, 3, 7, 8, 6};


        Assert.assertEquals(120,Factorial.factorial(5));
        Assert.assertEquals(1,FindLowestDifference.lowestDiff(fLDA, fLDB));
        Assert.assertEquals(9,FindMissingNumber.missingNum(fMN));

        //[30,12,5,9,2,20,33,1],[18,25,41,47,17,36,14,19]
    }
}
