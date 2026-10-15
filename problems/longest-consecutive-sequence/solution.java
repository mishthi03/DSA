import java.util.HashSet;
class Solution {
public int longestConsecutive(int[] nums) {
    
        int longest = 0;
        HashSet<Integer> set = new HashSet<>();
         for (int num : nums) {
        set.add(num);
 }

        // Find the starting point of each sequence
        for (int num : set) {
            if (!set.contains(num - 1)) {

                int count = 1;
                int current = num;

                // Count consecutive elements
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                // Update maximum length
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}