class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        while(j < n && sum < target){
            sum += nums[j++];
            //if(sum >= target) break;
        }
        j--;
        while(j < n && i < n){
            int len = j-i+1;
            if(sum >= target) minLength = Math.min(minLength,len);
            sum -= nums[i];
            i++;
            j++;
            while(j < n && sum < target){
                sum += nums[j++];
                //if(sum >= target) break;
            }
            j--;
        }
        if(minLength==Integer.MAX_VALUE) return 0;
        return minLength;
    }
}