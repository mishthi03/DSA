class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }
        long orig = x;
        long rev = 0;
        while(orig != 0){
            long digit =  orig % 10;

            rev = rev * 10 + digit;

            orig /= 10;
        }
        if(rev == x)
        return true;
        else
        return false;
      }
      
}