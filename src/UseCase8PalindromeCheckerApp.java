import java.util.*;

public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        // create linked list
        LinkedList<Character> list = new LinkedList<>();

        for(char c : word.toCharArray()){
            list.add(c);
        }

        boolean isPalindrome = true;

        // compare first and last
        while(list.size() > 1){
            if(list.removeFirst() != list.removeLast()){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }

    }
}