class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(numList);
        if(numList.size()==set.size())
            return false;
        else
            return true;
    }
}