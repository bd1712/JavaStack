package ubungen1;

public class Euler {
    public  static  final  double EPSILON = 0.0000000001;
    public  static  long fak(int i) {
        if(i > 1)
            return i * fak(i-1);
        else  return 1;
    }
    public  static  double euler1 () {
        int i = 1;
        for(double rsum = 0.0,
            rg = 1.0; rg  >= EPSILON; ) {
            rsum = rsum + rg;
            rg = rg / i++;
        }
        return i ; // error here was
    }
    public  static  double euler2 () {
        double rsum = 0.0, rg = 1.0;
        for(int i = 1; rg  >= EPSILON; i++) {
            rsum = rsum + rg;
            rg = 1/fak(i);
        }
        return rsum;
    }
    public  static  double euler3 () {
        double rsum = 0.0, rg = 1.0;
        for(int i = 1; rg  >= EPSILON; i++) {
            rsum = rsum + rg;
            rg = rg / i;
        }
        return rsum;
    }
}


