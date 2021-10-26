package com.zahid;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class BracketCheckerTest {

    BracketChecker bracketChecker = null;

    @BeforeEach
    void init() {
        bracketChecker = new BracketChecker();
    }

    @Test
    @DisplayName("Testing balanced expression")
    void testBalancedExpression() {
        String input = "[{()}]";
        assertTrue(bracketChecker.isBalanced(input));
    }
    
    @Test
    @DisplayName("Testing imbalanced expression")
    void testImbalancedExpression() {
        String input = "[(]}(";
        assertTrue(!bracketChecker.isBalanced(input));
    }

    @Test
    @DisplayName("Testing balanced expression with spaces")
    void testExpressionWithSpace() {
        String input = "[ {  (   )  } ]";
        assertTrue(bracketChecker.isBalanced(input));
    }
}
