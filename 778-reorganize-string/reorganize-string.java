class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->hs.get(b)-hs.get(a));
        StringBuilder sb=new StringBuilder();
        pq.addAll(hs.keySet());
        char prev='#';
        while(!pq.isEmpty()){
            char cur=pq.poll();
            if(cur==prev){
                if(pq.isEmpty()){
                    return "";
                }
                char next=pq.poll();
                sb.append(next);
                hs.put(next,hs.get(next)-1);
                if(hs.get(next)==0){
                    hs.remove(next);
                }
                else{
                    pq.add(next);
                }
                pq.add(cur);
                prev=next;

            }
            else{
                sb.append(cur);
                hs.put(cur,hs.get(cur)-1);
                if(hs.get(cur)==0){
                    hs.remove(cur);
                }
                else{
                    pq.add(cur);
                }
                prev=cur;
            }
        }
    return sb.toString();

    }
}