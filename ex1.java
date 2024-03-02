import java.util.HashMap;

public class ex1 {
    static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(Integer.valueOf(nums[i]), map.getOrDefault(Integer.valueOf(nums[i]), 0) + 1);
        }
        
        for (Integer i : map.keySet()) {
            if((map.get(i)).intValue() == 1) return i.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 2, 6, 4, 1};
        int result = singleNumber(nums);
        if(result==Integer.MIN_VALUE) System.out.println("Every number has appeared at least twice");
        else System.out.println(singleNumber(nums));
    }
}