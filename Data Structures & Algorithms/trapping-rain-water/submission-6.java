class Solution {
    public int trap(int[] height) {
        int i=0, j=1, count=0, min = 0, volume=0;
        boolean start=true;

        while(j<height.length){
            while(j<height.length && height[i]>height[j]){
                j++;
            }
            if(j==height.length){
                int max=0, maxId=j-1;
                while(maxId>i){
                    if(max<height[maxId]){
                        max=height[maxId];
                        j=maxId;
                    }
                    maxId--;
                }
                if(j==height.length) break;
            }
            min = Math.min(height[i], height[j]);
            i++;
            while(i<j){
                volume = volume + min - height[i++];
            }
            j++;  
        }
        return volume;
    }
}
