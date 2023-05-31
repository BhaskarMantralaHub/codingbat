public class WarmUp {

    public static void main(String[] args) {
        String str = "bacd";
        System.out.println(stringTimes(str, 10));
    }

    /**
     * The parameter weekday is true if it is a weekday,
     * and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }

    /**
     * https://codingbat.com/prob/p181646
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    /**
     * https://codingbat.com/prob/p154485
     */
    public int sumDouble(int a, int b) {
        int sum = a + b;
        return a == b ? 2 * sum : sum;
    }

    // https://codingbat.com/prob/p116624
    public int diff21(int n) {
        int difference = Math.abs(n - 21);
        return 21 < n ? 2 * difference : difference;
    }

    // https://codingbat.com/prob/p140449
    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    // https://codingbat.com/prob/p182873
    public boolean makes10(int a, int b) {
        return (a + b) == 10 || (a == 10) || (b == 10);
    }

    // https://codingbat.com/prob/p184004
    public boolean nearHundred(int n) {
        return Math.abs(200 - n) <= 10 || Math.abs(100 - n) <= 10;
    }

    //   https://codingbat.com/prob/p159227
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) return a < 0 && b < 0;
        return (a < 0 && b >= 0) || (a >= 0 && b < 0);
    }

    //    https://codingbat.com/prob/p191914
    public String notString(String str) {
        return str.startsWith("not") ? str : "not ".concat(str);
    }

    //    https://codingbat.com/prob/p190570
    public String missingChar(String str, int n) {
        return str.replace(String.valueOf(str.charAt(n)), "");
    }

    //    https://codingbat.com/prob/p123384
    public String frontBack(String str) {
        if (str.length() < 2) return str;

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        String sub = str.substring(1, str.length() - 1);
        return lastChar + sub + firstChar;
    }

    public static String front3(String str) {
        int endIndex = Math.min(str.length(), 3);
        return str.substring(0, endIndex).repeat(3);
    }

    public String backAround(String str) {
        String lastChar = str.substring(str.length() - 1);
        return lastChar + str + lastChar;
    }

    public String front22(String str) {
        int len = Math.min(2, str.length());
        return str.substring(0, len) + str + str.substring(0, len);
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }

    public boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public boolean isTeen(int a) {
        return a >= 13 && a <= 19;
    }

    public String delDel(String str) {
        if (str.length() < 1) return str;

        boolean hasDel = str.substring(1).startsWith("del");
        if (hasDel) return str.replace("del", "");

        return str;
    }

    public boolean mixStart(String str) {
        return str.split(" ")[0].endsWith("ix");
    }

    public String startOz(String str) {
        if (str.length() < 2) return str;

        String ozString = "";

        if (str.charAt(0) == 'o') ozString += "o";
        if (str.charAt(1) == 'z') ozString += "z";

        return ozString;

    }

    public int intMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public int close10(int a, int b) {
        int absA = Math.abs(10-a);
        int absB = Math.abs(10-b);
        if (absA == absB) return 0;
        return absA>absB ? b : a;
    }

    public int max1020(int a, int b) {
        boolean isAInRange = isNumberInRange(a, 10, 20);
        boolean isBInRange = isNumberInRange(b, 10, 20);
        if (!isAInRange && !isBInRange) return 0;
        else if (isAInRange && !isBInRange) return a;
        else if (!isAInRange) return b;
        return Math.max(a, b);
    }

    public boolean isNumberInRange(int a, int range1, int range2) {
        return a >= range1 && a <= range2;
    }

    public boolean stringE(String str) {
        int eCount = str.length() - str.replaceAll("e", "").length();
        return eCount >=1 && eCount <=3;
    }

    public boolean lastDigit(int a, int b) {
        return a%10 == b%10;
    }

    public String endUp(String str) {
        if (str.length() < 3) return str.toUpperCase();
        return str.substring(0, str.length()-3) + str.substring(str.length()-3).toUpperCase();
    }

    public String everyNth(String str, int n) {
        if (str.length() < n) return str;
        StringBuilder responseString = new StringBuilder();

        char[] charArr = str.toCharArray();
        for (int index = 0; index < charArr.length && n < charArr.length; index+=n) {
            responseString.append(charArr[index]);
        }

        return responseString.toString();
    }

    public static String stringTimes(String str, int n) {
        return str.repeat(n);
    }










}
