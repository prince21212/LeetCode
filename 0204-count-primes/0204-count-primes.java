class Solution {
    public int countPrimes(int n) {
        var primes = new boolean[n];
        int count = 0;

        if (n <= 1) return 0;
        Arrays.fill(primes, true);

        primes[0] = primes[1] = false;

        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                count++;

                for (int j = 2 * i; j < n; j = j + i)
                    primes[j] = false;
            }
        }

        return count;
    }
}