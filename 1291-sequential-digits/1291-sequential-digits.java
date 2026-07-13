class Solution {
    List<Integer> list=new ArrayList<>();
    
    public boolean nn(int x,int low,int high,int c)
    {
        if(x>=low && x<=high)
        {
            list.add(x);
        }
        if(x>high ||c>9)
        return false;
       
        return nn(x*10+(c),low,high,c+1);
    }
    public List<Integer> sequentialDigits(int low, int high) {
         
        for(int i=1;i<=9;i++)
        {
            nn(i,low,high,i+1);
        }
        Collections.sort(list);
        return list;
         
    }
}