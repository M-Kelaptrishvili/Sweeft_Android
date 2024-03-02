import java.util.HashMap;

public class ex2 {
    static int currResult = Integer.MAX_VALUE;
    static int minSplit(int amount) {
        int[] nums = {1, 5, 10, 20, 50};
        int cnt = 0;
        currResult = Integer.MAX_VALUE;
        helper(nums, amount, cnt);
        return currResult;
    }

    static void helper(int[] nums, int amount, int cnt) {
        if(currResult < cnt) return;
        if(amount==0) {
            if(currResult > cnt) currResult = cnt;
            return;
        }
        if(amount<0) return;
        for (int i = 0; i < nums.length; i++) {
            helper(nums, amount-nums[i], cnt+1);
        }
    }

    public static void main(String[] args) {
        int amount = 177;
        System.out.println(minSplit(amount));
    }
}