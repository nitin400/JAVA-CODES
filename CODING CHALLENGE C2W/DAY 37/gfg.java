static int findPlatform(int arr[], int dep[], int n) {
    // Sort arrival and departure arrays
    Arrays.sort(arr);
    Arrays.sort(dep);

    // Variables to track platforms needed and maximum seen
    int platforms_needed = 1;
    int result = 1;

    int i = 1; // Index for arrivals
    int j = 0; // Index for departures

    while (i < n && j < n) {
        // If the next arrival is earlier than the current departure,
        // we need another platform
        if (arr[i] <= dep[j]) {
            platforms_needed++;
            i++;
        } else { // A train can depart; a platform becomes free 
            platforms_needed--;
            j++;
        }

        // Update the maximum platforms needed 
        result = Math.max(result, platforms_needed);
    }

    return result;
}