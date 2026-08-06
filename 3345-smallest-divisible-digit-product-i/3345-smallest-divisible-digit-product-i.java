class Solution {
    public int smallestNumber(int n, int t) {

    while(true){
        
        int temp = n;
        int multi=1;
        while(temp>0){
            int digit = temp%10;
            multi = multi*digit;
           temp = temp/10;
        }
         if(multi % t == 0){
            return n;
        }

        n++;    

    }
       
    }
}