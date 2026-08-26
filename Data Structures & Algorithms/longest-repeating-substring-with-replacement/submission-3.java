class Solution {
    public int characterReplacement(String s, int k) {
        int[] counter = new int[26];
        int max=0, ans=0;
        for(int left=0,right=0;right<s.length();right++){
            max = Math.max(max, ++counter[s.charAt(right)-'A']);
            if(right-left+1-max>k){
                counter[s.charAt(left)-'A']--;
                left++;
                continue;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}
