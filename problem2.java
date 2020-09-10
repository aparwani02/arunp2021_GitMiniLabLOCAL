import java.util.*;

public class problem2 {
    public static void main(String[] args) {

        System.out.println("Enter string below.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split("\\s+");

        HashMap<String,Integer> nonRepeats = new HashMap();
        ArrayList<String> repeats = new ArrayList();

        for(int i = 0; i < split.length; i++) {
            if(nonRepeats.containsKey(split[i].toLowerCase()) && !repeats.contains(split[i].toLowerCase())) {
                repeats.add(split[i].toLowerCase());
            }
            else {
                nonRepeats.put(split[i].toLowerCase(), 1);
            }
        }

        System.out.println(repeats);

    }
}