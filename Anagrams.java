import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Anagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

    public static int numberNeeded(String first, String second) {
        Map<Character, Integer> m1 = new HashMap<Character, Integer>();
        Map<Character, Integer> m2 = new HashMap<Character, Integer>();
        for(int i = 0 ; i < first.length() ; i++){
            if(m1.containsKey(first.charAt(i))){
                m1.put(first.charAt(i), (m1.get(first.charAt(i)) + 1));
            }else
                m1.put(first.charAt(i), 1);
            System.out.println(first.charAt(i) + " " + m1.get(first.charAt(i)));
        }
        System.out.println();
        for(int i = 0 ; i < second.length() ; i++){
            if(m2.containsKey(second.charAt(i))){
                m2.put(second.charAt(i), (m2.get(second.charAt(i)).intValue() + 1));
            }else
                m2.put(second.charAt(i), 1);
            System.out.println(second.charAt(i) + " " + m2.get(second.charAt(i)));
        }
        int ctr = 0, flag;
        Set<Character> set = new HashSet<Character>();


        String s = first+second;
        for(int i = 0 ; i < s.length() ; i++){
            set.add(s.charAt(i));
        }
        for(Character c : set){
            System.out.println(ctr);
            if(m1.containsKey(c)){
                if(m2.containsKey(c)){
                    ctr += (m1.get(c) > m2.get(c))?((m1.get(c) - m2.get(c))):((m2.get(c) - m1.get(c)));
                }else{
                    ctr += m1.get(c);
                }
            }else{
                ctr += m2.get(c);
            }
        }
        return ctr;
    }
}
