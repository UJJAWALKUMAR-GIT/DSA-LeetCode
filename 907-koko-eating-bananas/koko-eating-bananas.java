class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(nums[i], max);
        }
        int lo = 1;
        int hi = max;
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int sum = 0;
            for (int i = 0; i < n; i++){
                 double temp = (double) nums[i] / mid;
                sum += Math.ceil(temp);}
            if (sum <= h) {
                hi = mid-1;
                ans = mid;
            } else
                lo = mid + 1;
        }
        return ans;
    }
}