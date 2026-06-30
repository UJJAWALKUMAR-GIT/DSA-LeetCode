class Solution {
    public boolean capacity(int[] nums, int days, int mid){
        int n = nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            if(sum > mid){
                days--;
                sum = nums[i];
            }
            if(days==0) return false;
        }
        return true;
    }
    public int shipWithinDays(int[] nums, int days) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sumAll = 0;
        for(int i=0;i<n;i++){
            max = Math.max(nums[i],max);
            sumAll += nums[i];
        }
        int lo = max;
        int hi = sumAll;
        int ans = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(capacity(nums,days,mid)){
                ans = mid;
                hi = mid-1;
            }else lo = mid+1;
        }
        return ans;
    }
}