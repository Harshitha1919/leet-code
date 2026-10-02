class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            hs.put(tasks[i],hs.getOrDefault(tasks[i],0)+1);
        }
       int count=0;
           while(!hs.isEmpty()){
              ArrayList<Character> arr=new ArrayList<>(hs.keySet());
              Collections.sort(arr,(a,b)->hs.get(b)-hs.get(a));
              int used = Math.min(n + 1, arr.size());
              for(int i=0;i<used;i++){
                count++;
                 char task=arr.get(i);
                 hs.put(task,hs.get(task)-1);
                 if(hs.get(task)==0){
                    hs.remove(task);
                 }
              }
                if (!hs.isEmpty()) {
        count += n + 1 - used;
    }

             
           }
        return count;
    }
}