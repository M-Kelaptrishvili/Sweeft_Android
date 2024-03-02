public class ex4 {
    static String addBinaryString(String s1, String s2) {
        int first = getIntFromBinString(s1);
        first+=getIntFromBinString(s2);
        return (Integer.toBinaryString(first));
    }
    static int getIntFromBinString(String s) {
        int result = 0;
        for (int i = 0; i <= s.length()-1; i++) {
            result+= (s.charAt(s.length()-1-i) - '0') << i;
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "1010";
        String s2 = "1011";
        System.out.println(addBinaryString(s1, s2));
    }
}