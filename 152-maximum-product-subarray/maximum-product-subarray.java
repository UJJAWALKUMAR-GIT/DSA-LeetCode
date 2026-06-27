class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxHere = nums[0];
        int minHere = nums[0];
        int result = nums[0];
        for (int i = 1; i < n; i++) {
            int curr = nums[i];
            int currMax = maxHere * nums[i];
            int currMin = minHere * nums[i];
            maxHere = Math.max(curr, Math.max(currMax, currMin));
            minHere = Math.min(curr, Math.min(currMax, currMin));
            result = Math.max(result, maxHere);
        }
        return result;
    }
}