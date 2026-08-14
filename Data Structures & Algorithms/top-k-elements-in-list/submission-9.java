class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Long> map = Arrays.stream(nums)
                                        .boxed()
                                        .collect(Collectors.groupingBy(i->i,Collectors.counting()));
        int[] result= map.entrySet()
                        .stream()
                        .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                        .limit(k)
                        .mapToInt(entry->entry.getKey().intValue())
                        .toArray();
        return result;
    }
}
