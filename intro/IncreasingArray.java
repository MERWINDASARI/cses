package intro;

import java.util.*;

public class IncreasingArray{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            long n = sc.nextLong();
            long res=0;
            long i=0;
            long previous=0;
            long current=0;
            while(i<n){
                if(i==0){
                    previous = sc.nextLong();
                }else{
                    current = sc.nextLong();
                    if(current<previous){
                        res+=previous-current;
                    }else{
                        previous=current;
                    }
                }
                i++;
            }
            System.out.println(res);
        }
    }
}