package org.example.bracket_validation;

import java.util.Deque;
import java.util.LinkedList;

public class BracketValidator {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0
                || s.isEmpty()
                || hasForbiddenCharacters(s)
                || hasInvalidStartingBracket(s)) {
            System.out.println(s + " is not valid");
            return false;
        }

        Deque<Character> openingBrackets = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                openingBrackets.addFirst(ch);
            } else {
                if (!openingBrackets.isEmpty() && ((openingBrackets.peekFirst() == '(' && ch == ')')
                        || (openingBrackets.peekFirst() == '{' && ch == '}')
                        || (openingBrackets.peekFirst() == '[' && ch == ']'))) {
                    openingBrackets.removeFirst();
                }
            }
        }

        boolean isValid = openingBrackets.isEmpty();
        System.out.println(s + (isValid ? " is a valid string" : " is not a valid string"));
        return  isValid;
    }

    public boolean hasInvalidStartingBracket(String s) {
        return (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}');
    }

    public boolean hasForbiddenCharacters(String s) {
        return s.replaceAll("[\\[\\](){}]", "").length() > 0;
    }
}
