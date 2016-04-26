import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GhettoSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] charArray = str.toCharArray();

        GhettoDictionary(charArray);
    }
    private static void GhettoDictionary(char[] nums){
        Map<Character, String> map = new HashMap<Character, String>();
        map.put('0', "Gee");
        map.put('1', "Bro");
        map.put('2', "Zuz");
        map.put('3', "Ma");
        map.put('4', "Duh");
        map.put('5', "Yo");
        map.put('6', "Dis");
        map.put('7', "Hood");
        map.put('8', "Jam");
        map.put('9', "Mack");

        for (int i = 0; i <nums.length ; i++) {
            System.out.print(map.get(nums[i]));
        }
    }
}
