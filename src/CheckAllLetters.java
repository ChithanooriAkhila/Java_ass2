import java.util.HashSet;
import java.util.Scanner;

public class CheckAllLetters {
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
        HashSet<Character> set = new HashSet<>();
        for(char ch:inputString.replace(" ","").toCharArray()){
            set.add(ch);
        }
        if(set.size()==26) return true;
        return false;
    }
}
/*
time complexity:O(n)
space complexity:O(1)
 */
