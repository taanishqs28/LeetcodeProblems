class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length() == 0){
            return 0;
        }
        int maxLength = 0;
        int count = 0 ;
        Map<Character,Integer> longestString = new HashMap<>();

        for(int i = 0; i< s.length(); i++){
            char currentChar = s.charAt(i);

            if(longestString.containsKey(currentChar)){
                count = Math.max(count, longestString.get(currentChar)+1);
                
            }
            
            longestString.put(currentChar, i);
            maxLength = Math.max(maxLength, i-count+1);

        }

        return maxLength;
        
    }
}
