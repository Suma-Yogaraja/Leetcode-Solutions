class Solution {
    public int maximumDetonation(int[][] bombs) {
        //here treat bombs as node and neighbours as other bomb that can detonate,now constriuct graph and do bfs/dfs to know how many neighbour bomb 
        //it can detonate
        int maxi = 0;
        for (int i = 0; i < bombs.length; i++) {
            maxi = Math.max(maxi, detonateNumber(bombs, i));//return count of bomb that bomb[i] can detonate
        }
        return maxi;
    }

    private int detonateNumber(int[][] bomb,int start){
            Queue<Integer> q=new LinkedList<>();
            Set<Integer> visited=new HashSet<>();//add index to set
            q.offer(start);
            visited.add(start);
            int count=1;
            while(!q.isEmpty()){
                int currBomb=q.poll();
                for(int i=0;i<bomb.length;i++){
                  if(!visited.contains(i) && isDetnoate(bomb[currBomb],bomb[i])){
                    visited.add(i);
                    q.offer(i);
                    count++;
                   }
                }  
            }
            return count;
        }
        private boolean isDetnoate(int[] pointX,int[] pointY){
            long dx=(long)pointX[0]-pointY[0];
            long dy=(long)pointX[1]-pointY[1];
            long radius=(long)pointX[2];//because we have to check whether other point is within this radius
            long distance=dx*dx+dy*dy;
            return (distance<=(radius*radius));

        }
}