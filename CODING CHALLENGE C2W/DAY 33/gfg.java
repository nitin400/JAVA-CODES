public long countSubArrayProductLessThanK(long a[], int n, long k) {
    long start = 0;
    long end = 0;
    long curr_product = 1;
    long count = 0;

    while (end < n) {
        curr_product *= a[(int) end];

        while (start < end && curr_product >= k) {
            curr_product /= a[(int) start];
            start++;
        }

        if (curr_product < k) {
            count += end - start + 1;
        }

        end++;
    }

    return count;
}

