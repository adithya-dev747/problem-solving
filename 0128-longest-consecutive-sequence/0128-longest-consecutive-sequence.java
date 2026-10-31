class Solution {
    public int longestConsecutive(int[] nums) {
        int maxl=0;
        HashMap<Integer,Boolean> map= new HashMap<>();
        for(int num : nums){
            map.put(num,Boolean.FALSE);
        }
        for(int num : nums){
            if (map.get(num) == true) {
                continue;
            }
            int curr=1;
            map.put(num, Boolean.TRUE);
            int next=num+1;
            while(map.containsKey(next) && map.get(next)==false){
                curr++;
                map.put(next, Boolean.TRUE);
                next++;
        

            }
            int prev=num-1;
            while(map.containsKey(prev) && map.get(prev)==false){
                curr++;
                map.put(prev, Boolean.TRUE);
                prev--;
        

            }
            maxl=Math.max(curr,maxl);
        }
        return maxl;
    }
}