class Solution {
    public int maxArea(int[] heights) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int volume = 0;
        int length=1;
        int result = 0;

        for(int i=0;i<heights.length;i++){
            for(int j=i+1; j<heights.length;j++){
                if(heights[i]>heights[j])
                    volume = heights[j]*length;
                else if(heights[i]<=heights[j])
                    volume = heights[i]*length;
                length++;
                List test = new ArrayList<>(List.of(heights[i], heights[j]));
                //System.out.println(test.toString()+" - volume: "+volume);
                map.put(volume, new ArrayList<>(List.of(heights[i], heights[j])));
            } 
            length=1;
        }

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if(entry.getKey()>result){
                result = entry.getKey();
            }                   
        }
        
        System.out.println(result);
        return result;
        
    }
}
