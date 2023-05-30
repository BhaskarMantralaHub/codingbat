public class WarmUp {

    public static void main(String[] args) {
        System.out.println("Hello");
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




}
