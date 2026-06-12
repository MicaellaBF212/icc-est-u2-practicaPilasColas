package utils;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueuePalindrome {
    public boolean isPalindrome(String text){
        Queue<Character> colaPrincipal = new ArrayDeque<>();
        Queue<Character> colaInvertida = new ArrayDeque<>();
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]!= ' '){
                colaPrincipal.offer(chars[i]);
            }
        }
        for (int i = chars.length-1; i >=0; i--) {
            if(chars[i]!= ' '){
                colaInvertida.offer(chars[i]);   
            }         
        }
        while (!colaPrincipal.isEmpty()) {
            char c1 = colaPrincipal.poll();
            char c2 = colaInvertida.poll();
            if(c1 != c2){
                return false;
            }
        }
        return true;
       
    }
}
