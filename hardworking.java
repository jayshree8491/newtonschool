import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int count = 0;
    public static void numberOfDays(long n){
        if(n>1){
            numberOfDays(n>>1);
        }
        if((n&1)!=0){
            count++;
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        numberOfDays(n);
        System.out.println(count);
    }
}