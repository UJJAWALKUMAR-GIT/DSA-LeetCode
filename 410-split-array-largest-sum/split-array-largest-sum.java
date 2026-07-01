class Solution {
    public boolean split(int[] nums,int k,int mid){
        int n = nums.length;
        int maxSub = 0;
        int sum =0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            if(sum > mid){
                k--;
                maxSub = Math.max(maxSub,sum-nums[i]);
                sum = nums[i];
            }
            if(k==0) return false;
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sumAll = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
            sumAll += nums[i];
        }
        int lo = max;
        int hi = sumAll;
        int ans = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(split(nums,k,mid)){
                ans = mid;
                hi = mid-1;
            }else lo = mid+1;
        }
        return ans;
    }
}