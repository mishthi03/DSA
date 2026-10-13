class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for(int i=0; i<nums1.length; i++) {
            if(map.containsKey(nums1[i])) {
                continue;
            }
            map.put(nums1[i], 1);
        }

        for(int i=0; i<nums2.length; i++) {
            if(map.containsKey(nums2[i])) {
                res.add(nums2[i]);
                map.remove(nums2[i]);
            }
        }

        int[] result = new int[res.size()];
        for(int i=0; i<res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}