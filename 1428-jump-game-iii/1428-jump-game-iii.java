class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited=new boolean[arr.length];
        // visited[start]=true;
        return canVisit(arr,start,visited);
    }
    private boolean canVisit(int[] arr,int startIndex,boolean[] visited){
         if(startIndex>=arr.length || startIndex <0 || visited[startIndex]==true)
            return false;
         if(startIndex<arr.length && arr[startIndex]==0)
            return true;
        visited[startIndex]=true;
        boolean left=canVisit(arr,startIndex+arr[startIndex],visited);
        // visited[startIndex]=false;
        boolean right=canVisit(arr,startIndex-arr[startIndex],visited);
        return left || right;
    }
}
























//         Queue<Integer> q=new LinkedList<>();
//         q.offer(start);
//         Set<Integer> visited=new HashSet<>();
//         visited.add(start);
//         while(!q.isEmpty()){
//             int size=q.size();
//             for(int i=0;i<size;i++){
//                 int k=q.poll();
//                 if(arr[k]==0)
//                     return true;
//                 //check up directions is within boundry and not visited
//                 int up=k+arr[k];
//                 if(up<arr.length && !visited.contains(up) && up>=0){
//                     visited.add(up);
//                     q.offer(up);
//                 }
//                  //check down directions is within boundry and not visited
//                 int down=k-arr[k];
//                 if(down<arr.length && !visited.contains(down) && down>=0){
//                     visited.add(down);
//                     q.offer(down);
//                 }
//             }
//         }
//         return false;
//     }
// }