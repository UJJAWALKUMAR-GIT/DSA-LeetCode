class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ' ') {
                if (count > 0) {
                    for (int j = i + 1; j <= i + count; j++) {
                        sb.append(arr[j]);
                    }
                    sb.append(' ');
                }
                count = 0;
            } else{
                count++;
            }
        }
        if(count>0){
            for(int i=0;i<count;i++){
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}