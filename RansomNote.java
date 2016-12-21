import java.io.*;
import java.util.*;

public class RansomNote {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        Hashtable<String, Integer> h = new Hashtable<String, Integer>();
        for(int i = 0 ; i < m ; i++){
            if(!h.containsKey(magazine[i])){
                h.put(magazine[i], 1);
            }else{
                h.put(magazine[i], h.get(magazine[i]) + 1);
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(!h.containsKey(ransom[i])){
                System.out.println("No");
                System.exit(0);
            }else{
                h.put(ransom[i], h.get(ransom[i]) - 1);
                if(h.get(ransom[i]) == 0){
                    h.remove(ransom[i]);
                }
            }
        }
        System.out.println("Yes");
    }
}
