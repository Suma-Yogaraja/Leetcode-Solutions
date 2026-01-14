class Solution {

    public int countCompleteComponents(int n, int[][] edges) {
        //dfs graph,input is edge so convert to adj list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        if (n <= 1)
            return n;
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        int ans = 0;
        boolean[] seen = new boolean[n];
        for (int key : graph.keySet()) {
            if (!seen[key]) {
                Set<Integer> component = new HashSet<>();
                dfs(graph, key, seen, component);
                if (isComplete(graph, component))
                    ans += 1;
            }
        }

        return ans;
    }

    private void dfs(Map<Integer, List<Integer>> graph, int node, boolean[] seen, Set<Integer> component) {
        if (seen[node] == true)
            return;
        seen[node] = true;
        component.add(node);
        for (int neighbour : graph.get(node)) {
            if (!seen[neighbour]) {
                dfs(graph, neighbour, seen, component);
            }
        }
    }

    private boolean isComplete(Map<Integer, List<Integer>> graph, Set<Integer> component) {
        int n = component.size();
        for (int node : component) {
            if (graph.get(node).size() != n - 1) {
                // System.out.println("node size is is " + graph.get(node).size() + " n is " + n);
                return false;
            }
        }
        return true;
    }
}