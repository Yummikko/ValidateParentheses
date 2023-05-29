package org.example.bracket_validation;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

class BracketValidatorTest {

    @Test
    public void testIfStringIsValid() {

        BracketValidator bracketValidator = new BracketValidator();

        assertTrue(bracketValidator.isValid("()"));
        assertTrue(bracketValidator.isValid("[]"));
        assertTrue(bracketValidator.isValid("{}"));
        assertTrue(bracketValidator.isValid("()[]"));
        assertTrue(bracketValidator.isValid("(){}"));
        assertTrue(bracketValidator.isValid("[]{}"));
        assertTrue(bracketValidator.isValid("{[()]}"));
        assertTrue(bracketValidator.isValid("[{()}]"));
        assertTrue(bracketValidator.isValid("({[]})"));

        assertFalse(bracketValidator.isValid(""));
        assertFalse(bracketValidator.isValid("("));
        assertFalse(bracketValidator.isValid(")"));
        assertFalse(bracketValidator.isValid("["));
        assertFalse(bracketValidator.isValid("]"));
        assertFalse(bracketValidator.isValid("{"));
        assertFalse(bracketValidator.isValid("}"));
        assertFalse(bracketValidator.isValid("(("));
        assertFalse(bracketValidator.isValid("))"));
        assertFalse(bracketValidator.isValid("[["));
        assertFalse(bracketValidator.isValid("]]"));
        assertFalse(bracketValidator.isValid("{{"));
        assertFalse(bracketValidator.isValid("}}"));
        assertFalse(bracketValidator.isValid("()("));
        assertFalse(bracketValidator.isValid("[]{)"));
        assertFalse(bracketValidator.isValid("{(())]"));
        assertFalse(bracketValidator.isValid("letters"));
        assertFalse(bracketValidator.isValid("!"));

    }

}