package _5_kyu;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {

    @Test
    public void Sample_tests() {
        assertEquals("abCCde", Kata.workOnStrings("abc","cde"));
        assertEquals("abcDeFGtrzWDEFGgGFhjkWqE", Kata.workOnStrings("abcdeFgtrzw", "defgGgfhjkwqe"));
        assertEquals("abcDEfgDEFGg", Kata.workOnStrings("abcdeFg", "defgG"));
        assertEquals("ABABbababa", Kata.workOnStrings("abab", "bababa"));
    }

}