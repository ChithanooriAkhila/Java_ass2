import java.util.HashMap;
import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
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
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch:inputString.replace(" ","").toCharArray()){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        if(hm.size()==26) return true;
        return false;
    }
    //ex:The quick brown fox jumps over the lazy dog //pangram
    // Amazingly few discotheques provide jukeboxes
}
/*
time complexity:O(n)
space complexity:O(1)
 */
