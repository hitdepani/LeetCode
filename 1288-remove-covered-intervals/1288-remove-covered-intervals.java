class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals, (a, b) -> {
    if (a[0] == b[0]) {
        return Integer.compare(b[1], a[1]); 
    } else {
        return Integer.compare(a[0], b[0]); 
    }
});
        int c=0;
        int max=intervals[0][1];
        for(int i=1;i<n;i++)
        {
            if(max>=intervals[i][1])
            c++;
            else
            max=intervals[i][1];
        }

        return n-c;
    }
}