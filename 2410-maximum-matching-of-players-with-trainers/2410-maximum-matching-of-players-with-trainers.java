class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
       
    
        Arrays.sort(players);
        Arrays.sort(trainers);
        int j=0,i=0,n=players.length,m=trainers.length;
        int lens=trainers.length;
        while (i <n && j < m)
        {
            if(players[i]<=trainers[j])
            {
                i++;
                j++;
            }
            else
            j++;
        }
        return i;
    }

}