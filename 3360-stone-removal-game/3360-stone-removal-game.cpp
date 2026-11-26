class Solution {
public:
    bool canAliceWin(int n) {
        int x=10;
        bool al=true;
        while(n>=x)
        {
            n-=x;
            x--;
            al=!al;
        }
        return !al;
    }
};