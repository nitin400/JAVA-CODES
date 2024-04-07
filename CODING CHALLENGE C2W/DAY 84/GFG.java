class Solution
{
    public String FirstNonRepeating(String A)
    {
        StringBuilder ans=new StringBuilder();
        Map<Character,Integer> map=new HashMap<>();
        Queue<Character> q=new LinkedList<>();
        for(char ch:A.toCharArray()){
            if(q.contains(ch)){
                map.put(ch,1);
                q.remove(ch);
                if(q.isEmpty()){
                  ans.append('#');
                }else{
                  ans.append(q.peek());
                }
            }else{
                if(!map.containsKey(ch)){
                    q.add(ch);
                }
                if(q.isEmpty()){
                  ans.append('#');
                }else{
                  ans.append(q.peek());
                }
            }
        }
        return ans.toString();
    }
}