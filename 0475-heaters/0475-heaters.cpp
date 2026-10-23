class Solution {
public:
    int findRadius(vector<int>& houses, vector<int>& heaters) {
        sort(houses.begin(),houses.end());
        sort(heaters.begin(),heaters.end());
        int m=0;
        int i=0,j=0;
        while(i<houses.size()&&j<heaters.size()-1)
        {
            while(i<houses.size()&&(abs(heaters[j]-houses[i])<abs(heaters[j+1]-houses[i])))
            {
                m=max(m,abs(heaters[j]-houses[i]));
                i++;
            }
            j++;
        }
        while(i<houses.size())
        {
            m=max(m,abs(heaters[j]-houses[i]));
            i++;
        }
        return m;
    }
};