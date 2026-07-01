class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        int[] nums = new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] <= nums2[j]){
                nums[k++] = nums1[i++];
            }else nums[k++] = nums2[j++];
        }
        while(i<nums1.length) nums[k++] = nums1[i++];
        while(j<nums2.length) nums[k++] = nums2[j++];

        int n = nums.length;
        int lo = 0;
        int hi = nums.length-1;
        double median;
        if(n%2==0){
            int mid1 = lo + (hi-lo)/2;
            int mid2 = mid1+1;
            median = ((double)nums[mid1] + nums[mid2]) / 2;
        }else{
            int mid = lo + (hi-lo)/2;
            median = nums[mid];
        }
        return median;
    }
}