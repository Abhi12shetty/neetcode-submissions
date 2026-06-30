class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        String sortedSString = new String(sArray);
        String sortedTString = new String(tArray);
        if(sortedSString.equalsIgnoreCase(sortedTString))
            return true;
        else 
            return false;
    }
}
