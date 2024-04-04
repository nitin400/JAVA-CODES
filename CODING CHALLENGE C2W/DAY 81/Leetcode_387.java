class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character,Integer> mp=new LinkedHashMap<>();

        for(int i=0;i<s.length();i++){

            if(!mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),1);
            }
            else{
                int count = mp.get(s.charAt(i));
                mp.put(s.charAt(i), count + 1);
            }
        }

        for(int i=0;i<s.length();i++){

            if(mp.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;

    }
}