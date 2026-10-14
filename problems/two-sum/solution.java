class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int firstvalue = nums[i];
            int second = target - firstvalue;

            if(map.containsKey(second)){  
                //check whether second element is already exists as a key
                int previousIndex = map.get(second);
                // if yes we get the index stored against that key
                return new int[]{ previousIndex, i};
            }
            map.put(firstvalue , i); //if no we store it in the table
        }
        return new int[]{};
        
    }
}