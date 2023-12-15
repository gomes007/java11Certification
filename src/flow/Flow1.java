package flow;

public class Flow1 {

    private static void print (int[] nums) {
        for (var i = 0; i < nums.length; ++i) {
            System.out.println(nums[i]);
        }


    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        print(nums);
    }
}
