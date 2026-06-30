class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(numList);
        if(nums.length==set.size())
            return false;
        else
            return true;
    }
}