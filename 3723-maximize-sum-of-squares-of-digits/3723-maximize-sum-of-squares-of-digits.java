class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder s=new StringBuilder();
        if (sum>num*9)return "";
        int a=sum/9;
        int b=sum%9;
        for(int i=0;i<a;i++)
        s.append('9');
        if(s.length()<num)
        s.append(b);
        while(s.length()<num)
        s.append('0');
        return s.toString();
    }
}