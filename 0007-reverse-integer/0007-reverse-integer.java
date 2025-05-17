class Solution {
    public int reverse(int x) {
       
        int reverse=0;
        int rem;
        while(x!=0){
            rem=x%10;
            if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
                return 0; // Prevent integer overflow
            }

            reverse=(reverse*10)+rem;
            x = x/10;
        }
        return reverse;  
    }
   
}