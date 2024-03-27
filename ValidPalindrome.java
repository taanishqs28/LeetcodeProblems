public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        s = s.toLowerCase();

        String orignalString = "";

        boolean ans = false;
        String rev = "";

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                orignalString = orignalString + ch;
            }
        }
        for(int i = s.length()-1; i>=0; i--){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                rev = rev + ch;
            }
        }
        if(rev.equals(orignalString)){
            ans= true;
        }

        System.out.println(rev);
        System.out.println(s);
        return ans;

    }
}

