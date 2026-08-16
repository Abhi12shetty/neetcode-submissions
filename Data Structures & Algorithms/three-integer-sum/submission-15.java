class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int k=0;k<nums.length && nums[k]<=0;k++){
            if(k==0 || nums[k]!=nums[k-1]){
                System.out.println("K value: "+k);
                twoSum(nums, k, result);
            }
        }
        return result;
    }

    public void twoSum(int[] numbers, int start, List<List<Integer>> result) {
        int i=start+1, j=numbers.length-1;
        while(i<j){
            if(numbers[start]+numbers[i]+numbers[j]>0)
                j--;
            else if(numbers[start]+numbers[i]+numbers[j]<0)
                i++;
            else{
                if(numbers[i-1]==numbers[i] && (j+1<numbers.length) && numbers[j+1]==numbers[j]){
                    i++;j--;
                    continue;
                }
                result.add(Arrays.asList(numbers[start], numbers[i++], numbers[j--]));
                System.out.println("result: "+result);
            }
        }
    }
}
