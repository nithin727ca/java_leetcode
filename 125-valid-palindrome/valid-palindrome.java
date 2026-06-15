class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int left=0;
        int right=s.length()-1;
        while(left < right){
            char left_char=s.charAt(left);
            char right_char=s.charAt(right);
            if(!Character.isLetterOrDigit(left_char)){
                left++;
            }else if(!Character.isLetterOrDigit(right_char)){
                right--;
            }else{
                if(Character.toLowerCase(left_char)!=Character.toLowerCase(right_char)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}