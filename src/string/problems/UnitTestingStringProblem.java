package string.problems;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        String s="Human brain is a biological learning machine";
        Map<Integer, String> largest=new HashMap<Integer, String>();
        largest.put(10,"biological");

        Assert.assertEquals(true,Anagram.isAnagram("time","eimt"));
        Assert.assertEquals(false,Anagram.isAnagram("mint","emit"));
        Assert.assertEquals(largest,DetermineLargestWord.findTheLargestWord(s));
        //Assert.assertEquals();
        //Assert.assertEquals();

    }
}
