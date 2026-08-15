class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        for(int i=0, j=nums.length-1;i<nums.length && j>=0;i++,j--){
            if(i==0){
                pre[i]=1;
                post[j]=1;
                continue;
            }
            pre[i]=pre[i-1]*nums[i-1];
            post[j]=post[j+1]*nums[j+1];
        }
        for(int i=0;i<pre.length;i++){
            pre[i]=pre[i]*post[i];
        }
        return pre;
    }
}  
