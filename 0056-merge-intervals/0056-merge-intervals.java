class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<1){
            return intervals;
        }
        ArrayList<int[]> res=new ArrayList<>();
        Arrays.sort(intervals,Comparator.comparingInt(i -> i[0]));
        int[] newint=intervals[0];
        res.add(newint);
        for(int[] interval : intervals){
            if(interval[0]<=newint[1]){
                newint[1]=Math.max(interval[1],newint[1]);

            }
            else{
                newint=interval;
                res.add(newint);
            }
        }

        return res.toArray(new int[res.size()][]);
        
    }
}