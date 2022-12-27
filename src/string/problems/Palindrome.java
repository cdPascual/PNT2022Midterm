package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String s1,s2,s3,s4,s5;
        s1 = "terminate";
        s2 = "MOM";
        s3 = "soloolos";
        s4 = "soloxolos";
        s5 = "solomnolos";

        System.out.println(isPalindrome(s5));

    }

    public static boolean isPalindrome(String s){
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
