public class ex5 {
    static int cnt = 0;
    static int countVariants(int stearsCount) {
        cnt = 0;
        helper(stearsCount);
        return cnt;
    }

    static void helper(int stearsCount) {
        if(stearsCount==0) {
            cnt++;
            return;
        }
        if(stearsCount < 0) return;
        helper(stearsCount-1);
        helper(stearsCount-2);
    }

    public static void main(String[] args) {
        System.out.println(countVariants(3));
    }
}