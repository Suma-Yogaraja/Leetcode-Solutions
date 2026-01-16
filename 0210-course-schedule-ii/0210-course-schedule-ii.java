class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //like a topo sort
        //first create a adj list
        int[] ans = new int[numCourses];
        Stack<Integer> stack = new Stack<>();
        Map<Integer, List<Integer>> adj = new HashMap<>();
        boolean[] onPath = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++)
            adj.put(i, new ArrayList<>());
        for (int[] pre : prerequisites)
            adj.get(pre[1]).add(pre[0]);
        //now call dfs
        boolean[] visited = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (dfs(i, visited, adj, stack, onPath))
                    return new int[0];
            }
        }
        int j = 0;
        while (!stack.isEmpty()) {
            ans[j++] = stack.pop();
        }
        return ans;
    }

    private boolean dfs(int node,boolean[] visited,Map<Integer,
                        List<Integer>> adj,Stack<Integer>  stack,boolean[] onPath){

        onPath[node]=true;
        visited[node]=true;
        for(int course:adj.get(node)){
            if(onPath[course])
                return true;
            if(!visited[course]){
                if(dfs(course,visited,adj,stack,onPath))
                    return true;     
            }
           
        }
        onPath[node]=false;
        stack.push(node);
        return false;
    }

}