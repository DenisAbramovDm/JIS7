package homework.lecturetwo.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindromeTest() {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("a,qbccbA"));
    }
}