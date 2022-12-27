package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

        String word = "time";

       //word = swap(word,0,word.length()-1);

       //System.out.println(word);
        permute(word,0,word.length()-1);



    }

    public static void permute(String s, int l, int r){

        if(l==r)
            System.out.println(s);
        else
            for(int i=l;i<=r;i++){
                s=swap(s,l,i);
                permute(s,l+1,r);
                s=swap(s,l,i);
            }

        //System.out.println(s);


    }

    public static String swap(String s, int l, int r){
        char temp;
        char[] sArray =s.toCharArray();

        temp = sArray[l];
        sArray[l] = sArray[r];
        sArray[r]= temp;
        //System.out.println(temp);

        return String.valueOf(sArray);

    }

}
