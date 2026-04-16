class Solution {
    public int amount(int[] nums, int idx,int stop, int[] dp){
        if(idx >stop) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int take = nums[idx] + amount(nums,idx+2,stop,dp);
        int skip = amount(nums,idx+1,stop,dp);
        return dp[idx] = Math.max(take,skip);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0]; 
        int[] dp1 = new int[nums.length];
        Arrays.fill(dp1,-1);
        int amount1 = amount(nums,0,n-2,dp1);
        int[] dp2 = new int[nums.length];
        Arrays.fill(dp2,-1);
        int amount2 = amount(nums,1,n-1,dp2);
        return Math.max(amount1,amount2);
    }
}