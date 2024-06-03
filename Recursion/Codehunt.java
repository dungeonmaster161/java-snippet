package Recursion;

public class Codehunt {
    public  int findFactorial(int n) {
        if(n == 1) {
             return 1;
        }else {
            return n * (findFactorial(n-1));
        }
}
}
