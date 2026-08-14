class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return nums.length!=set.size();*/

        Set<Integer> set = new HashSet<Integer>();
        for(int i:nums){
            if(set.contains(i))
                return true;
            else
                set.add(i);
        }
        return false;
    }
}