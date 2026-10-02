class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb=new StringBuilder();
        HashMap<Character,Integer> hs=new HashMap<>();
        if(a>0)hs.put('a',a);
        if(b>0)hs.put('b',b);
        if(c>0)hs.put('c',c);
        PriorityQueue<Character> pq=new PriorityQueue<>((x,y)->hs.get(y)-hs.get(x));
        pq.addAll(hs.keySet());
        while(!pq.isEmpty()){
            char first=pq.poll();
            if(sb.length()>=2&&sb.charAt(sb.length()-1)==first && sb.charAt(sb.length()-2)==first ){
                if(pq.isEmpty()){
                    break;
                }
                char second=pq.poll();
                sb.append(second);
                hs.put(second,hs.get(second)-1);
                if(hs.get(second)==0){
                    hs.remove(second);
                }
                else{
                    pq.add(second);
                }
                pq.add(first);
            }
            else{
                sb.append(first);
                 hs.put(first,hs.get(first)-1);
                if(hs.get(first)==0){
                    hs.remove(first);
                }
                else{
                    pq.add(first);
                }


            }
        }
      return  sb.toString();

    }
}