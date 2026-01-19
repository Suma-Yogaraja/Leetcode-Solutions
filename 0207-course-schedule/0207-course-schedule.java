class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //detect a cycle in DAG using dfs
        boolean[] visited = new boolean[numCourses];
        boolean[] pathVisited = new boolean[numCourses];
        //create adj list
        Map<Integer, List<Integer>> adj = new HashMap<>();//node:dependants
        for (int i = 0; i < numCourses; i++)
            adj.put(i, new ArrayList<>());
        for (int[] pre : prerequisites)
            adj.get(pre[1]).add(pre[0]);
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (detectCycle(adj, visited, i, pathVisited)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean detectCycle(Map<Integer, List<Integer>> adj, boolean[] visited,
            int node, boolean[] pathVisited) {
        pathVisited[node] = true;
        visited[node] = true;
        for (int nei : adj.get(node)) {
            if (!visited[nei]) {
                if (detectCycle(adj, visited, nei, pathVisited))
                    return true;
            }else if (pathVisited[nei]){
                return true;
            }
        }
        pathVisited[node] = false;
        return false;
    }
}