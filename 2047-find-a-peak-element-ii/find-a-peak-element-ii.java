class Solution {
    public int[] findPeakGrid(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int maxRow = 0;
            for (int i = 1; i < m; i++) {
                if (nums[i][mid] > nums[maxRow][mid]) {
                    maxRow = i;
                }
            }
            int left = Integer.MIN_VALUE;
            int right = Integer.MIN_VALUE;

            if (mid > 0) {
                left = nums[maxRow][mid - 1];
            }

            if (mid < n - 1) {
                right = nums[maxRow][mid + 1];
            }

            if (nums[maxRow][mid] > left && nums[maxRow][mid] > right) {
                return new int[] { maxRow, mid };
            } else if (left > nums[maxRow][mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }
}