class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map= new HashMap<>();
        char[] arr=new char[26];
        int n=word.length();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(word.charAt(i)))
            {
                map.put(word.charAt(i),map.get(word.charAt(i))+1);
            }
            else 
            map.put(word.charAt(i),1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        Iterator<Map.Entry<Character, Integer>> iterator = list.iterator();
        int res=0;
        int x=1;
        while(iterator.hasNext())
        {
            Map.Entry<Character,Integer> e=iterator.next();
            char c=e.getKey();
            int cc=e.getValue();
            if(x<=8)
            {
                res+=cc;
            }
            else if(x<=16)
            {
                res=res+(cc*2);
            }
            else if(x<=24)
            {
                res=res+(cc*3);
            }
            else
            res=res+(cc*4);
            x++;
        }
        return res;
    }
}