class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> m=new HashMap<>();
        for(char x:s.toCharArray())m.put(x, m.getOrDefault(x,0)+1);
        List<Character> l=new ArrayList<>(m.keySet());
        l.sort((a,b)->m.get(b)-m.get(a));
        StringBuilder sb=new StringBuilder();
        for(char ch:l){
            int freq=m.get(ch);
            for(int i=0;i<freq;i++)sb.append(ch);
        }
        return new String(sb);
    }
}