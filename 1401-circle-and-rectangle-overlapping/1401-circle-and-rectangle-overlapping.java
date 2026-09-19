class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int a=Math.min(xCenter,x2);
        int b=Math.max(a,x1);
        int c=Math.min(yCenter,y2);
        int d=Math.max(y1,c);
        double dis=Math.sqrt(Math.pow(b-xCenter,2)+Math.pow(d-yCenter,2));
        return dis<=radius;
    }
}