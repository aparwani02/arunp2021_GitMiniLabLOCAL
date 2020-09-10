import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        int spaces = 0;
        System.out.println("Enter string below.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for(int i = 0; i < input.length(); i++) {
            if(i < input.length()-1 && input.substring(i,i+1).equals(" ") && !input.substring(i+1,i+2).equals(" ")) {
                spaces+=1;
            }
            else if(i == input.length()-1 && input.substring(i, i+1).equals(" ")) {
                spaces+=1;
            }
        }
        System.out.println(spaces);
    }
}