package org.example.bracket_validation;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

class BracketValidatorTest {

    BracketValidator bracketValidator = new BracketValidator();

    @Test
    public void testIfStringIsValid() {

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

    @Test
    public void testHasInvalidStartingBracket() {

        assertTrue(bracketValidator.hasInvalidStartingBracket(")"));
        assertTrue(bracketValidator.hasInvalidStartingBracket("]"));
        assertTrue(bracketValidator.hasInvalidStartingBracket("}"));
        assertTrue(bracketValidator.hasInvalidStartingBracket("){][)"));

        assertFalse(bracketValidator.isValid("("));
        assertFalse(bracketValidator.isValid("["));
        assertFalse(bracketValidator.isValid("{"));
        assertFalse(bracketValidator.isValid("{}[)"));
    }
}