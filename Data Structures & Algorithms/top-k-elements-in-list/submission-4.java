class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> resultList = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num:nums){            
            if(!map.containsKey(num)){
                map.put(num, 1);
            } else{
                int count = map.get(num);
                count=count+1;
                map.put(num, count);
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
