class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int l=operations.length;
        int count=0;
      
        for(int i=0;i<l;i++)
        {
            if(operations[i].equals("--X"))
            {count=count-1;
            }
            else if(operations[i].equals("X--"))
            {
                  count=count-1;
            }
            else if(operations[i].equals("X++"))
            {
                count=count+1;
            }
            else if(operations[i].equals("++X"))
            {
              count=count+1;
            }
        }
        return count;
    }
}
