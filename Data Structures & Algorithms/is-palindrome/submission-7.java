class Solution {
    public boolean isPalindrome(String s) {
        /*StringBuilder sb = new StringBuilder("");

        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toString(s.charAt(i)).toLowerCase());
            }
        }

        for(int i=0,j=sb.length()-1;i<sb.length();i++,j--){
            if(sb.charAt(i)!=sb.charAt(j))
                return false;
        }*/
        int i=0,j=s.length()-1;
        while(i<=j){
            
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(j>i && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}
