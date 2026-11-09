class Solution {
public:
    int minCost(int n) {
        int cost=0;
        int a=1;
        int b=0;
        while(n>1){
            b=n-1;
            n=n-1;
            cost+=(a*b);
        }
        return cost;
    }
};