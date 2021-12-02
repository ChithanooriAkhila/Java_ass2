import java.util.Locale;
import java.util.Scanner;

/*
Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive).
Write time and space complexity of your solution as comments in the source file.
 */
public class Alphabet {
    static int arr[]=new int[26];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String inputString=sc.nextLine();
        if(containsAllLetters(inputString.toLowerCase())){
            System.out.println("input string contains all the letters of the alphabet");
        }
        else{
            System.out.println("input string does not contain all the letters of the alphabet");
        }
    }
    public static boolean containsAllLetters(String inputString){
        if(inputString.length()<26) return false;
        for(char ch:inputString.toCharArray()){
            if(ch-32!=0) arr[ch-'a']++;
        }
        for(int x:arr){
            if (x==0) return false;
        }
        return true;
    }
}
/*
time complexity:O(n)
space complexity:O(1)
 */
