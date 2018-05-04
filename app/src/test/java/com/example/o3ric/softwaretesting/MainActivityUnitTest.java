package com.example.o3ric.softwaretesting;

import org.junit.Test;
import com.example.o3ric.softwaretesting.MainActivity;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MainActivityUnitTest {
    @Test
    public void palindrome_check_is_correct() throws Exception {
        String palindrome = "arara";
        String notPalindrome = "dajsijadsjads";
        MainActivity mainActivity = new MainActivity();
        assertEquals(true, mainActivity.isPalindrome(palindrome));
        assertEquals(false, mainActivity.isPalindrome(notPalindrome));
    }

    @Test(expected = Exception.class)
    public void palindrome_check_does_not_accept_empty_strings() throws Exception {
        MainActivity mainActivity = new MainActivity();
        assertNotEquals(true, mainActivity.isPalindrome(""));
        assertNotEquals(false, mainActivity.isPalindrome(""));
    }
}