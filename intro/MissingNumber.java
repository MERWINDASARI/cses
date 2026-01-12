package intro;
import java.util.*;
public class MissingNumber {
    public static void main(String[] args){
        long sum=0;
        long n = 0L;
        try(Scanner sc = new Scanner(System.in)){
            n = sc.nextLong();
            Long i=n;
            while(i>1){
                sum+=sc.nextLong();
                i--;
            }
        }

        System.out.println(((n*(n+1))/2 - sum));

    }
}
