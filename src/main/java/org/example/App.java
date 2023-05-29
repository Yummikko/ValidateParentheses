package org.example;


import org.example.bracket_validation.BracketValidator;

public class App
{
    public static void main( String[] args ) {

        BracketValidator bracketValidator = new BracketValidator();
        bracketValidator.isValid("I'm not a valid string");
        bracketValidator.isValid("{[]}");
        bracketValidator.isValid("}{");
        bracketValidator.isValid("{]()");
        bracketValidator.isValid("{}[]()");
        bracketValidator.isValid("([)]");
        bracketValidator.isValid("))");
        bracketValidator.isValid("[bracket]");
        bracketValidator.isValid(".");
        bracketValidator.isValid("");

    }

}
