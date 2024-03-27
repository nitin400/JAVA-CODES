class Solution {
    public int calPoints(String[] operations) {
       
        int[] scores = new int[operations.length];
        int size = 0;
        
        for (String op : operations) {
            if (op.equals("+")) {
                scores[size] = scores[size - 1] + scores[size - 2];
                size++;
            } else if (op.equals("D")) {
                scores[size] = 2 * scores[size - 1];
                size++;
            } else if (op.equals("C")) {
                size--;
            } else {
                scores[size] = Integer.parseInt(op);
                size++;
            }
        }
        
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += scores[i];
        }
        
        return sum;
    }
}