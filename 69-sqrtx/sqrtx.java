class Solution {
    public int mySqrt(int x) {
        int lo = 1;
        int hi = x;
        int ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if ((long)mid * mid == x)
                return mid;
            else if ((long)mid * mid > x) {
                hi = mid - 1;
            } else{
                ans = mid;
                lo = mid+1;
                }
        }
        return ans;
    }
}