class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int productAll = 1;
        int countOfZero=0;
        for(int num:nums){
            if(num!=0)
                productAll=productAll*num;
            else
                countOfZero+=1;
        }
        System.out.println(productAll);
        System.out.println(countOfZero);
        for(int j=0;j<nums.length;j++){
            if(countOfZero>1 || (nums[j]!=0 && countOfZero==1)){
                res[j]=0;
            } else {
                if(nums[j]==0 && countOfZero==1)
                    res[j]=productAll;
                else
                    res[j] = productAll/nums[j];
            }
        }
        return res;
    }
}  
