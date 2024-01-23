/*
 * 
 */

public class BuildingRecievingSunlight {
    public static int longest(int arr[],int n)
    {
 int tallest = -1;

  // Count the number of buildings receiving sunlight.
  int count = 0;

  // Keep track of the last index of a building with the same height as the tallest.
  int lastSameHeight = -1;

  // Loop through all buildings.
  for (int i = 0; i < n; i++) {
    // If the current building is taller than the tallest seen so far,
    // reset the lastSameHeight and increment the count.
    if (arr[i] > tallest) {
      lastSameHeight = -1;
      count++;
      tallest = arr[i];
    }
    // If the current building has the same height as the tallest and it's not the last building with that height,
    // consider it receiving sunlight only if it comes after the last building with the same height.
    else if (arr[i] == tallest && i > lastSameHeight) {
      count++;
    }
    // Update the lastSameHeight whenever we encounter a building with the same height as the tallest.
    else if (arr[i] == tallest) {
      lastSameHeight = i;
    }
  }

  return count;
    }
}
}
