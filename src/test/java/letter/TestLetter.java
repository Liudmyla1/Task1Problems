package letter;

import org.junit.Assert;
import org.junit.Test;
import problems.letter.Letter;

public class TestLetter {
    @Test
    public void testIsLatinLetter() {
        Assert.assertEquals(false, Letter.isLatinLetter(12));
    }

    @Test
    public void testPositiveIsLatinLetter() {
        Assert.assertTrue(Letter.isLatinLetter(83));
    }

    @Test
    public void testNegativeIsLatinLetter() {
        Assert.assertFalse(Letter.isLatinLetter(1));
    }

    @Test
    public void testPositiveIsHigher() {
        Assert.assertEquals(false, Letter.isHigher(78, 75));
    }

    @Test
    public void testNegativeIsHigher() {
        Assert.assertEquals(false, Letter.isHigher(65, 73));
    }

    @Test
    public void testPositiveIsLower() {
        Assert.assertTrue(Letter.isLower(78, 83));
    }

    @Test
    public void testNegativeIsLower() {
        Assert.assertFalse(Letter.isLower(86, 65));
    }
}
