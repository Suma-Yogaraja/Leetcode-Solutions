class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, List<String>> map = new HashMap<>();
        Set<String> ans = new HashSet<>();
        for (int i = 0; i < keyName.length; i++) {
            String key = keyName[i];
            String value = keyTime[i];
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(value);
        }
        for (List<String> time : map.values())
            Collections.sort(time);
        for (String key : map.keySet()) {
            List<Integer> min = new ArrayList<>();
            for (String time : map.get(key)) {
                String[] parts = time.split(":");
                int totaltime = Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
                min.add(totaltime);
            }
            int start = 0;
            int end = 0;
            while (end < min.size()) {
                if (min.get(end) - min.get(start) > 60) {
                    start++;
                }
                if (end - start + 1 >= 3) {
                    ans.add(key);
                    break;
                }
                end++;
            }
        }
        return  new ArrayList<>(ans);
    }
}