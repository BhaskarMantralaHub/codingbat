import java.util.Arrays;
import java.util.Collections;

public class WarmUp2 {

    public static void main(String[] args) {
        String str = "bacd";
        int[] input = new int[]{1, 2, 9, 3};
        System.out.println(arrayFront9(input));
    }

    public static String stringTimes(String str, int n) {
        return str.repeat(n);
    }

    public static String frontTimes(String str, int n) {
        if (str.length() < 3) return str;
        return str.substring(0, 3).repeat(n);
    }

    int countXX(String str) {
        char[] charArray = str.toCharArray();
        int xCount = 0;
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == 'x' && charArray[i + 1] == 'x') xCount++;
        }

        return xCount;
    }

    boolean doubleX(String str) {
        int xIndex = str.indexOf("x");
        return str.startsWith("xx", xIndex);
    }

    public String stringBits(String str) {
        StringBuilder responseString = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            responseString.append(str.charAt(i));
        }

        return responseString.toString();
    }

    public String stringSplosion(String str) {
        StringBuilder responseString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            responseString.append(str, 0, i + 1);
        }

        return responseString.toString();
    }


    public int arrayCount9(int[] nums) {
        return (int) Arrays.stream(nums).filter(num -> num == 9).count();
    }

    public static boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9 && i < 4) return true;
        }

        return false;
    }

    public int stringMatch(String a, String b) {
        int cnt = 0;
        for (int i = 0; i < a.length() - 1 && i < b.length() - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                System.out.println(a.substring(i, i + 2));
                System.out.println(b.substring(i, i + 2));
                System.out.println("\n");
                cnt++;
            }
        }
        return cnt;
    }

    public String stringX(String str) {
        if (str.length() < 3) return str;
        return str.charAt(0) + str.substring(1, str.length() - 1).replaceAll("x", "") + str.charAt(str.length() - 1);
    }

    public boolean noTriples(int[] nums) {
        if (nums.length < 3) return true;
        for (int i=0; i< nums.length-2 ; i++) {
            if (nums[i] == nums[i+1] && nums[i] == nums[i+2]) return false;
        }
        return true;
    }


}
