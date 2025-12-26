package intro;

import java.util.*;

public class Weird {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            long num = input.nextLong();
            StringBuffer sb = new StringBuffer(Long.toString(num)+" ");
            while(num!=1){
                if((num&1)==1){
                    num*=3;
                    num++;
                    if(num < 0) break;
                }else{
                    num/=2;
                }
                sb.append(Long.toString(num)+" ");
            }
            System.out.println(sb.toString());
        }
    }
}