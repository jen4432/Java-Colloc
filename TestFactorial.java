import org.junit.Test;

public class TestFactorial {

    private Factorial f = new Factorial();

    @Test
    public void factorialTest(){
        assert(f.factorial(0) == 1);
        assert(f.factorial(1) == 1);
        assert (f.factorial(5) == 120);
    }

    @Test
    public void nFactorialTest(){
        long[] r = {1};
        assert (f.nFactorial(0).equals(r));
        long[] a = {1};
        assert (f.nFactorial(1).equals(a));
        long[] b = {1,2,6,24,120};
        assert(f.nFactorial(5).equals(b));
    }

}
