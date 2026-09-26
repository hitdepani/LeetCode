class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map= new HashMap<>(knowledge.size());
        for(List<String> li:knowledge)
        {
            map.put(li.get(0),li.get(1));
        }
        int n = s.length();
        StringBuilder res=new StringBuilder(s.length());
        StringBuilder temp=new StringBuilder();
        char charArray[]= s.toCharArray();
        boolean bracket=false;
        for(int i = 0;i <n; i++)
        {
            if(charArray[i]=='(')
            {
                bracket=true;
            }
            else if(charArray[i]==')')
            {
                String key=temp.toString();
                if(map.containsKey(key))
                {
                    res.append(map.get(key));
                }
                else
                {
                    res.append("?");
                }
                temp.setLength(0);
                bracket=false;
            }
            else
            {
                if(bracket)
                temp.append(charArray[i]);
                else
                res.append(charArray[i]);
            }
        }
        return res.toString();

    }
}