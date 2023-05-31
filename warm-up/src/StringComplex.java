public class StringComplex {

    public static void main(String[] args) {

    }

    //https://codingbat.com/prob/p199171
    public int countYZ(String str) {
        int cnt = 0;
        str = str.replaceAll("[^A-Za-z]", " ").trim();
        System.out.println(str);
        for (String eachStr: str.split(" ")) {
            System.out.println(eachStr);
            if (eachStr.toUpperCase().endsWith("Y") || eachStr.toUpperCase().endsWith("Z")) cnt++;
        }

        return cnt;
    }
}
