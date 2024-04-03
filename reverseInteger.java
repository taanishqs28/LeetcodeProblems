class Solution {
    public int reverse(int x) {
        long reverse = 0;
        while(x!=0){
            int lastDig = x%10;
            reverse += lastDig;

            reverse*=10;
            x = x/10; 
        }
        reverse /=10;
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*reverse);
        }
        return (int)reverse;
        
    }
}
