class Solution {
public:
    int countDaysTogether(string arriveAlice, string leaveAlice, string arriveBob, string leaveBob) {
        int a=(leaveAlice[0]-'0')*10 + (leaveAlice[1]-'0');
        int b=(arriveBob[0]-'0')*10 + (arriveBob[1]-'0');
        int c=(arriveAlice[0]-'0')*10+(arriveAlice[1]-'0');
        int d=(leaveBob[0]-'0')*10+(leaveBob[1]-'0');
        if(a<b||c>d)return 0;
        int aa=(arriveAlice[3]-'0')*10+(arriveAlice[4]-'0');
        int ab=(arriveBob[3]-'0')*10 + (arriveBob[4]-'0');
        int la=(leaveAlice[3]-'0')*10 + (leaveAlice[4]-'0');
        int lb=(leaveBob[3]-'0')*10+(leaveBob[4]-'0');
        vector<int> month {0,31,59,90,120,151,181,212,243,273,304,334,365};
        int startalice=month[c-1]+aa;
        int leavealice=month[a-1]+la;
        int startbob=month[b-1]+ab;
        int leavebob=month[d-1]+lb;
        return max(0,min(leavealice,leavebob)-max(startalice,startbob)+1);
    }
};