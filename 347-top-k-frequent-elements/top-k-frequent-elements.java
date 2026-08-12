class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        ArrayList<Map.Entry<Integer,Integer>> entries = new ArrayList<>(map.entrySet());

        entries.sort((a,b) -> b.getValue()-a.getValue());
        for (int i = 0; i < k; i++) {
            list.add(entries.get(i).getKey());
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}