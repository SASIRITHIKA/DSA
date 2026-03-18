class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] a = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            a[i] = -1;
            for (int j = 1; j < nums.length; j++) {
                int next = nums[(i + j) % nums.length];
                if (next > nums[i]) {
                    a[i] = next;
                    break;
                }
            }
        }
        return a;
    }
}