class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        //sort and 2 pointers
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0,j=0;
        int match=0;
        while(i<players.length && j<trainers.length){
            //if its a match
            if(players[i]<=trainers[j]){
                System.out.println("its am macth"+ trainers[j]);
                match++;//its a match
                i++;
                j++;
            }
            else{
                j++;
            }
            
        }
        return match;
    }
}