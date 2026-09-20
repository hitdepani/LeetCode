class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int sum=0,i=1;
        for(char c:s.toCharArray())
        {
            sum+=(('z'-c + 1)*i++);
        }
        return sum;
    }
}