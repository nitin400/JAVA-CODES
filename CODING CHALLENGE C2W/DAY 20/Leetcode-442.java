class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();

        // Create a HashMap to store the elements and their occurrences
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate over the array and store the elements and their occurrences in the HashMap
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
          //  System.out.println(entry.getKey() + " : " + entry.getValue());
          if(entry.getValue()==2){
              al.add(entry.getKey());
          }
        }
        return al;
    }
}