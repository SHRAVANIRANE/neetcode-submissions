class Solution {
    public boolean isPalindrome(String s) {
        int j=s.length()-1;
        int i=0;
        while(i<=j){
            if(!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            char c1=Character.toLowerCase(s.charAt(i));
            char c2=Character.toLowerCase(s.charAt(j));
            if(c1==c2){
                j--;
                i++;
            }else{
                return false;
            }
        }
        return true;
    }
}
