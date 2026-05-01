class Solution {
    public int total(List<List<Integer>> list,int i,int j,Integer[][] dp){
        if(i == list.size()-1) return list.get(i).get(j);
        if(dp[i][j]!=null) return dp[i][j];
        int take1 = total(list,i+1,j,dp);
        int take2 = total(list,i+1,j+1,dp);
        return dp[i][j] = list.get(i).get(j) + Math.min(take1, take2);
    }
    public int minimumTotal(List<List<Integer>> list) {
        int n = list.size();
        Integer[][] dp = new Integer[n][n];
        return total(list,0,0,dp);
    }
}
