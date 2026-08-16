class Solution {
    public int maxArea(int[] heights) {
        int volume = 0, min =0, maxVolume=0;
        // for(int i=0;i<heights.length;i++){
        //     for(int j=i+1, length=1; j<heights.length;j++,length++){
        //         volume = Math.min(heights[i], heights[j]) * length;
        //         maxVolume = Math.max(maxVolume, volume);
        //     }
        // }
        // return maxVolume;
        int i=0, j=heights.length-1;
        while(i<j){
            volume = Math.min(heights[i], heights[j]) * (j-i);
            maxVolume = Math.max(maxVolume, volume);
            if(heights[i]<=heights[j])
                i++;
            else if(heights[j]<heights[i])
                j--;
        }
        return maxVolume;
    }
}
