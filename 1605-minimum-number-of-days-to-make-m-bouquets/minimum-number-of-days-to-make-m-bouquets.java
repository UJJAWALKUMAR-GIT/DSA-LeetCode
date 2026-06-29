class Solution {
    public boolean bloom(int[] nums,int boq,int flo,int mid){
        int b = boq;
        int f = flo;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= mid)
                f--;
            else
                f = flo;
            if (f == 0){
                b--;
                f=flo;  
            } 
            if (b == 0) return true;
        }
        return false;
    }

    public int minDays(int[] nums, int boq, int flo) {
        int n = nums.length;
        if((long)boq*flo > n) return -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(nums[i], max);
        }
        int lo = 1;
        int hi = max;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if(bloom(nums,boq,flo,mid)){
                hi = mid;
            }else lo = mid+1;
        }
        return lo;
    }
}