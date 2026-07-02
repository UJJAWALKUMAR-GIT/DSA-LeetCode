class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int m = nums.length;
        int n = nums[0].length;
        int total = m * n;
        int lo = 0;
        int hi = total -1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            int row = mid/n;
            int col = mid % n;
            if(target == nums[row][col]) return true;
            else if(target  < nums[row][col]){
                hi = mid -1;
            }else lo = mid+1;
        }
        return false;
    }
}