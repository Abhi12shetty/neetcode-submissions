class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int num:nums){            
            if(!map.containsKey(num)){
                map.put(num, 1);
            } else{
                map.put(num, map.get(num)+1);
            }
        }
        List<Integer> sortedKeys = map.entrySet()
            .stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
        return sortedKeys.subList(0,k).stream().mapToInt(i -> i).toArray();
    }
}
