class Solution {
    Set<Integer> seen = new HashSet<>();
    Set<String> road = new HashSet<>();
    Map<Integer, List<Integer>> graph = new HashMap<>();

    public int minReorder(int n, int[][] connections) {
        
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        
        for (int[] connection : connections) {
            int from = connection[0];
            int to = connection[1];
            road.add(hashToSet(from, to)); 
            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        
        seen.add(0);
        return bfs(0);
    }

    String hashToSet(int x, int y) {
        return x + "," + y;
    }

    int bfs(int start) {
        int ans = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int k = q.poll();

            for (int neighbour : graph.get(k)) {
                if (!seen.contains(neighbour)) {
                    seen.add(neighbour);

                    
                    if (road.contains(hashToSet(k, neighbour))) {
                        ans++;
                    }

                    q.add(neighbour);
                }
            }
        }

        return ans;
    }
}
