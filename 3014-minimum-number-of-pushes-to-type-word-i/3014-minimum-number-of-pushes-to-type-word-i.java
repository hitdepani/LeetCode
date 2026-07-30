class Solution {
    public int minimumPushes(String word) {
        char arr[]= new char[26];
        int n=word.length();
        
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[word.charAt(i)-'a']++;
            c++;
        }
        if(c<=8)
        return c;
        else if(c<=16)
        {
            c-=8;
            return 8+(c*2);
        }      
        else if(c<=24)
        {
            c-=16;
            return (c*3)+8+16;
        }
        else
        {
            c-=24;
            return 8+16+24+(c*4); 
        }
    }
}