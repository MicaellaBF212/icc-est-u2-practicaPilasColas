package utils;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueuePalindrome {
    public boolean isPalindrome(String text){
        Queue<Character> cola = new ArrayDeque<>();
        for (char letra : text.toCharArray()) {
            if(letra!= ' '){
                cola.offer(letra);
            }
           
        }
        String invertido = "";
        String normal = "";
        while(!cola.isEmpty()){
            char c = cola.poll();
            normal += c;
            invertido = c+invertido;
        }
        if(normal.equals(invertido)){
            return true;
        }else{
            return false;
        }
    }
}
