package info.puzz.a10000sentences;

import org.junit.Assert;
import org.junit.Test;

public class SentenceQuizTest {

    @Test
    public void test() {
        SentenceQuiz q = new SentenceQuiz("ovo je, samo test");
        Assert.assertFalse(q.guessWord("jkljkl"));
        Assert.assertFalse(q.isFinished());
        Assert.assertTrue(q.guessWord("ovo"));
        Assert.assertFalse(q.isFinished());
        Assert.assertTrue(q.guessWord("je"));
        Assert.assertFalse(q.isFinished());
        Assert.assertTrue(q.guessWord("sAMO"));
        Assert.assertFalse(q.isFinished());
        Assert.assertTrue(q.guessWord("test"));
        Assert.assertTrue(q.isFinished());

        Assert.assertFalse(q.guessWord("jkljkljljKLJKLJK"));
        Assert.assertTrue(q.isFinished());
    }

}