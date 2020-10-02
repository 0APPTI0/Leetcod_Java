package _771宝石与石头;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    Set<Character>  set = new HashSet<>();
    int re = 0;
    public int numJewelsInStones(String J, String S) {
        for (int i = 0; i < J.length(); i ++){
            set.add(J.charAt(i));
        }

        for (int p = 0; p < S.length(); p ++){
            if (set.contains(S.charAt(p))){
                re++;
            }
        }
        return re;
    }
}
