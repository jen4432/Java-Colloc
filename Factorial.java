//Facade


import java.util.List;

public class Factorial {
    public long factorial(int a) {
        long result = 1;
        for(int i = 2; i <= a;i++){
            result *= i;
        }
        return result;
    }

    public long[] nFactorial(int a){
        long [] result  = new long[a];
        long p = 1;
        for(int i = 1;i <= a;i++){
            p*=i;
            result [i - 1] = p;
            System.out.println( i + " : "+ p);
        }
        return result;
    }
}
