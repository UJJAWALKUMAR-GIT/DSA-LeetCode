class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder();
        char[] arr = num.toCharArray();
        int n = arr.length;
        if ((arr[n - 1] - '0') % 2 == 1) {
            return num;
        }
        for (int i = n - 2; i >= 0; i--) {
            if ((arr[i] - '0') % 2 == 1) {
                for (int j = 0; j <= i; j++) {
                    sb.append(arr[j]);
                }
                return sb.toString();
            }
        }
        return "";
    }
}