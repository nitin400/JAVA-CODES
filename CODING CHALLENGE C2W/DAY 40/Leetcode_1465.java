class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        ArrayList<Integer> horizontal = new ArrayList<>();
        ArrayList<Integer> vertical = new ArrayList<>();
        for(int el: horizontalCuts){
            horizontal.add(el);
        }
        for(int el: verticalCuts){
            vertical.add(el);
        }
        Collections.sort(horizontal);
        Collections.sort(vertical);
        if(horizontal.size() == 0) {
            horizontal.add(0);
        }
        if(vertical.size() == 0) {
            vertical.add(0);
        }

        horizontal.add(h);
        vertical.add(w);

        long maxHorizontal = horizontal.get(0);
        long maxVertical = vertical.get(0);
        for(int i=1; i<horizontal.size(); i++){
            int diff = horizontal.get(i) - horizontal.get(i-1);
            maxHorizontal = Math.max(maxHorizontal, diff);
        }
        for(int i=1; i<vertical.size(); i++){
            int diff = vertical.get(i) - vertical.get(i-1);
            maxVertical = Math.max(maxVertical, diff);
        }

        return (int)((maxHorizontal * maxVertical) % (1_000_000_007));
    }
}