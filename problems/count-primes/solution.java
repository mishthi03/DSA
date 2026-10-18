class Solution {
    public int countPrimes(int n) {
        int[] a = new int[n];

        // Filling the array with 1
        for (int i = 0; i < n; i++) {
            a[i] = 1;
        }

        int c = 0;
             // then checking the multiples or here sum of all the numbers one by one 
        for (int i = 2; i < n; i++) {
            if (a[i] == 1) {
                c++;

                for (int j = i + i; j < n; j += i) {
                    a[j] = 0;
                }
            }
        }

        return c;
    }
}