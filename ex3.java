import java.util.ArrayList;

public class ex3 {

    static String longestPrefix(String[] array) {
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(i==0) {
                for (int j = 0; j < array[i].length(); j++) {
                    chars.add(Character.valueOf(array[i].charAt(j)));
                }
            } else {
                while(array[i].length() < chars.size()) {
                    chars.remove(chars.size()-1);
                }
                
                for (int j = 0; j < array[i].length(); j++) {
                    if(j >= chars.size()) break;
                    if(array[i].charAt(j) != chars.get(j).charValue()) {
                        while(chars.size() != j) {
                            chars.remove(chars.size()-1);
                        }
                        break;
                    }
                }
            }
        }
        char[] resultChars = new char[chars.size()];
        for (int i = 0; i < resultChars.length; i++) {
            resultChars[i] = chars.get(i).charValue();
        }
        String result = new String(resultChars);
        return result;
    }

    public static void main(String[] args) {
        String[] str = {"dog","racecar","car"};
        System.out.println(longestPrefix(str));
    }
}