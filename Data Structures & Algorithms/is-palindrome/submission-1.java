class Solution {
    public boolean isPalindrome(String s) {
        s=s.toUpperCase();
        boolean flag=true;

        String st = "";
        for(int i=0;i<s.length();i++){
            s.charAt(i);
            if(Character.isLetterOrDigit(s.charAt(i))){
                st=st+s.charAt(i);
            }
        }
        s=st;
         int j=s.length()-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s.charAt(j)){
                j--;
                continue;
            } else{
                System.out.println(s.charAt(i));
                System.out.println(s.charAt(j));
                flag=false;
                break;
            }
        }
        return flag;
    }
}
