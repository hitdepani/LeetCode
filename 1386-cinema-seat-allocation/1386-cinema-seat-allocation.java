import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) 
    {
        Map<Integer,Integer> m=new HashMap<>();
        for(int[] s:reservedSeats)
        {
            int i=s[0];
            int j=s[1];
            if(j>=2&&j<=9)
            {
                int k=m.getOrDefault(i,0);
                k|=(1<<(j-2));
                m.put(i,k);
            }
        }
        
        int z=2*n; 
        
        for(int k:m.values())
        {
            boolean b=(k&15)==0;
            boolean c=(k&240)==0;
            boolean d=(k&60)==0;
            
            z-=2;
            
            if(b&&c)
            {
                z+=2;
            }else if(b||c||d)
            {
                z+=1;
            }
        }
        
        return z;
    }
}