class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> list= new ArrayList<>();
        int n=intervals.length;
        if(n==0)
        return new int[][] { newInterval };
        int h=0;
        boolean intervalused=false;
        for(int i=0;i<n;i++)
        {
            int a=intervals[i][0];
            int b=intervals[i][1];
            int c=newInterval[0];
            int d=newInterval[1];
            if (d < a) {
                if (!intervalused) {
                    list.add(new ArrayList<>(List.of(c, d)));
                    intervalused = true;
                    h++;
                }
                list.add(new ArrayList<>(List.of(a, b)));
                h++;
            }
            else if(c<=b&&d>=a)
            {
                intervalused=true;
                a=Math.min(a,c);
                d=Math.max(b,d);
                list.add(new ArrayList<>(List.of(a, d)));
                h++;
                for(int j=i+1;j<n;j++)
                {
                    int x=intervals[j][0];
                    int y=intervals[j][1];
                    if(d>=y)
                    {
                        
                    }
                    else {
                        if(d>=x)
                        {
                            list.get(h-1).set(1,y);
                            d=y;
                        }
                        else
                        {
                            list.add(new ArrayList<>(List.of(x, y)));
                            
                        }
                    }
                    
                }
                break;
            }
            else
            {
                list.add(new ArrayList<>(List.of(a, b)));
                h++;
            }
            
            
            
        }
        if(!intervalused)
        list.add(new ArrayList<>(List.of(newInterval[0],newInterval[1])));
        int[][] primitiveArray = new int[list.size()][];
for (int i = 0; i < list.size(); i++) {
    List<Integer> row = list.get(i);
    primitiveArray[i] = new int[row.size()];
    for (int j = 0; j < row.size(); j++) {
        primitiveArray[i][j] = row.get(j); 
    }
}
return primitiveArray;
    }
}