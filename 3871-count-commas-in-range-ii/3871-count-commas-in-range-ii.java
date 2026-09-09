class Solution {
    public long countCommas(long n) {
        long s=Math.max(0,n-999);
        s+=Math.max(0,n-999999);
        s+=Math.max(0,n-999999999);
        s+=Math.max(0,n-999999999999L);
        s+=Math.max(0,n-999999999999999L);
        return s;
        
    }
}