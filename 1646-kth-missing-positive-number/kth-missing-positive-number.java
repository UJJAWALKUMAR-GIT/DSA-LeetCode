class Solution {
    public int findKthPositive(int[] nums, int k) {
        int n = nums.length;
        int lo = 0;
        int hi = n-1;
        if(nums[n-1]-n == 0) return n+k;
        while(lo <= hi){
            int mid = lo +(hi-lo)/2;
            int curr = nums[mid] - (mid+1);
            if(curr < k){
                lo = mid +1;
            }
            else hi = mid-1;  
        }
        return lo+k;
    }
}