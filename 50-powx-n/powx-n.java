class Solution {
    public double myPow(double x, long n) {
        long N=n;
        if(n==0){
            return 1;
        }
        if(N<0){
            N=-N;
            x=1/x;
        }
        return N%2==0 ? myPow(x*x,N/2):x*myPow(x*x,N/2);
    }
}