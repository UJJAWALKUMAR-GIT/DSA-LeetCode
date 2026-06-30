class Solution {
    public boolean put(int[] nums,int m, int mid){
        int count = 1;
        int last = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] - last >= mid){
                count++;
                last = nums[i];
            }
            if(count==m) return true;
        }
        return false;
    }
    public int maxDistance(int[] nums, int m) {
        Arrays.sort(nums);
        int n = nums.length;
        int lo = 1;
        int hi = nums[n-1] - nums[0];
        int ans = 0;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(put(nums,m,mid)){
                ans = mid;
                lo = mid+1;
            }else hi = mid-1;
        }
        return ans;
    }
}