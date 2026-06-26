class Solution {
    int count =0;
    public void mergeSort(int[] nums){
        int n = nums.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        int[] c = new int[n];
        for(int i=0;i<n/2;i++){
            a[i] = nums[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i] = nums[i+n/2];
        }
        mergeSort(a);
        mergeSort(b);
        countPairs(a,b,c);
        merge(a,b,c,nums);
    }
    public void merge(int[] a, int[] b, int[] c,int[] nums){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
        for(int p=0;p<c.length;p++){
            nums[p] = c[p];
        }
    }
    public void countPairs(int[] a, int[] b,int[] c){
        int j=0;
        for(int i=0;i<a.length;i++){
            while(j<b.length && (long)a[i] > 2 * (long)b[j]){
                j++;
                //count++;
            }
            count += j;
        }
    }
    public int reversePairs(int[] nums) {
        mergeSort(nums);
        return count;
    }
}