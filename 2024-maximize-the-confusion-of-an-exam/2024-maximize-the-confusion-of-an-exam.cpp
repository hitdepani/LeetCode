class Solution {
public:
    int maxConsecutiveAnswers(string answerKey, int k) {
        int m=0,left=0,f=0,n=answerKey.size();
        for(int right=0;right<n;right++)
        {
            if(answerKey[right]=='F') f++;
            while(f>k)
            {
                if(answerKey[left]=='F') f--;
                left++;
            }
            m=max(m,right-left+1);
        }
        left=0;
        int t=0;
        for(int right=0;right<n;right++)
        {
            if(answerKey[right]=='T') t++;
            while(t>k)
            {
                if(answerKey[left]=='T') t--;
                left++;
            }
            m=max(m,right-left+1);
        }
        return m;
    }
};