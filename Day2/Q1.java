class Q1 {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Q1 solution = new Q1();
        int[] nums = { 3, 2, 4 };
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}
