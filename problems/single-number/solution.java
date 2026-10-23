class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int eachElement: nums){
            result = result ^ eachElement;

        }
        return result;
    }
}