

class Solution {
    
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       
    Queue<Integer> queue=new LinkedList<>();
    int[] visitedArray=new int[V];
    ArrayList<Integer> resultList=new ArrayList<>();
    
    
    queue.offer(0);
    visitedArray[0]=1;
    
    while(!queue.isEmpty())
    {
    
        int val=queue.poll();
         
         resultList.add(val);
         
       
        for(int i:adj.get(val))
        {
            if(visitedArray[i]!=1)
            {    visitedArray[i]=1;
                queue.offer(i);
            }
             
        }
    }
    
    
    return resultList;
    
    
    }
}