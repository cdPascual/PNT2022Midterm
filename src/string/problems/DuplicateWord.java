package string.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        Map<String, Integer> words=new HashMap<String, Integer>();

        st=st.toLowerCase();

        String[] stArray =st.split("[,. _@!:;]+");

        int totalWords=0;
        int totalLetters=0;






        for(int i=0;i< stArray.length;i++){
            //System.out.println(stArray[i]);
            totalWords++;
            totalLetters=totalLetters+stArray[i].length();

            if(words.containsKey(stArray[i]))
                words.compute(stArray[i], (k,v)-> v+1);
            else
                words.put(stArray[i],1);
        }

        System.out.println("The average word length is: "+totalLetters/totalWords +" letters");
        System.out.println(words);


/*
        String  largest = stringArray[0];
        for(int i=1;i<stringArray.length;i++){

            if( largest.length()<stringArray[i].length())
                largest=stringArray[i];
        }
        */

    }

}
