class Solution {
    List<String> list=new ArrayList<>();
    void help(String num,long target,int i,long total,long prevnum,StringBuilder str) {
        if(i==num.length()){
            if(total==target)
            list.add(str.toString());
            return;
        }
        for(int j=i;j<num.length();j++)
        {
            if(j!=i&&num.charAt(i)=='0')
            break;
            long curr=Long.parseLong(num.substring(i,j+1));
            int len=str.length();
            if(i==0)
            {
                help(num,target,j+1,curr,curr,str.append(curr));
                str.setLength(len);
            }
            else
            {
                help(num,target,j+1,total+curr,curr,str.append("+").append(curr));
                str.setLength(len);

                help(num,target,j+1,total-curr,-curr,str.append("-").append(curr));
                str.setLength(len);


                help(num,target,j+1,total-prevnum+(prevnum*curr),prevnum*curr,str.append("*").append(curr));
                str.setLength(len);
            }
        }
    }
    public List<String> addOperators(String num, int target) {
        StringBuilder str= new StringBuilder();
        help(num,target,0,0,0,str);
        return list;
    }
}