class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int k = n/3;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key)>k) ans.add(key);
        }
        return ans;
    }
}