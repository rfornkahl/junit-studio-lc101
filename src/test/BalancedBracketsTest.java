package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //tests should guide how you revise the sourcecode. Use TDD to first write tests that will work for the
    //desired behavior of BalancedBrackets. When you tests fail, correct he class to pass your tests.

    //write at least 12 tests.

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //1

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyStringNoBrakcets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("chumbawamba"));
    }

    @Test
    public void onlyBrakcetsWithSpaceReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[ ]"));
    }

    @Test
    public void singleCharInBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[a]"));
    }


    @Test
    public void singleLowerCaseStringInBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[abba]"));
    }

    @Test
    public void singleUpperCaseStringInBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[ABBA]"));
    }

    @Test
    public void multipleLowerCaseStringsInBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[chumbawamba tubthumping emi records]"));
    }

    @Test
    public void closedBrackThenMutltipleStrings(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]chumbawamba tubthumping emi records"));
    }

    @Test
    public void stringThenNewStringWithinClosedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("chumbawamba tubthumping [emi] records"));
    }

    @Test
    public void onlyOneBracketLeftWithStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[chumbawamba"));
    }

    @Test
    public void twoTypesOfBracketsDontCloseWithStrings(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void twoTypesOfBracketsDontClose(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyOneBracketRightWithMultipleStringsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("chumbawamba tubthumping]"));
    }

    @Test
    public void onlyOneBracketLeftWithMultipleStringsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[chumbawamba tubthumping"));
    }

    @Test
    public void onlyOneBracketRightWithStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("chumbawamba]"));
    }

    @Test
    public void onlyOneBracketLeftReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyOneBracketRightReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
}
