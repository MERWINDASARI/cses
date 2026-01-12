package intro;
import java.util.*;

public class Repetitions {
    public static void main(String[] args) {
        String s;
        try(Scanner sc = new Scanner(System.in)){
            s = sc.nextLine();
        }
        int n=s.length();
        int res=0;
        int temp=1;
        int i=1;
        while(i<n){
            if(s.charAt(i)==s.charAt(i-1)){
                temp++;
            }else{
                res=Math.max(res,temp);
                temp=1;
            }
            i++;
        }
        res=Math.max(res,temp);
        System.out.println(res);
    }
}
