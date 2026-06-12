package utils;

import java.util.ArrayDeque;

public class SignValidator {
    public boolean isValid(String s) {
        ArrayDeque<Character> pila = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char letra = s.charAt(i);
            if (letra == '(') {
                pila.push(letra);
            } else if (letra == '[') {
                pila.push(letra);
            } else if (letra == '{') {
                pila.push(letra);
            } else {
                if (pila.isEmpty()) {
                    return false;
                }
                char x = pila.pop();
                if (letra == ')' && x != '(') {
                    return false;
                }
                if (letra == ']' && x != '[') {
                    return false;
                }
                if (letra == '}' && x != '{') {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }
}
