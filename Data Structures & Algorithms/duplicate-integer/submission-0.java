class Solution {
    public boolean hasDuplicate(int[] nums) {
        //List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        if(nums.length==set.size())
            return false;
        else
            return true;
    }
}