class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List ls=new ArrayList();
        int temp,d,check=0;
        for(int i=left;i<=right;i++)
        {temp=i;
            while(i!=0)
            {
                d=i%10;
                i=i/10;
                if(d==0)
                {
                    check=1;
                    break;
                }
                if(temp%d!=0)
                    check=1;
            }
         i=temp;
         if(check==0)
             ls.add(i);
         check=0;
        }
        return ls;
    }
}
