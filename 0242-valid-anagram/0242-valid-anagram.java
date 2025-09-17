class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(char c: s.toCharArray()){
            sMap.put(c, sMap.getOrDefault(c, 0)+1);   // s = "a:2"
        }

        for(char c: t.toCharArray()){
            tMap.put(c, tMap.getOrDefault(c, 0)+1);   // t = "a:1"
        }

        //System.out.print(sMap.keySet() + tMap.keySet());

        // return sMap.keySet().equals(tMap.keySet()) && sMap.values().equals(tMap.values());
        // return new HashSet<>(sMap.values()).equals(new HashSet<>(tMap.values()));
        return sMap.equals(tMap);
    }
}