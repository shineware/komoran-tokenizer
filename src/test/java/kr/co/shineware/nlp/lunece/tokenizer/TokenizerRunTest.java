package kr.co.shineware.nlp.lunece.tokenizer;

import kr.co.shineware.nlp.komoran.constant.DEFAULT_MODEL;
import kr.co.shineware.nlp.komoran.core.Komoran;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.analysis.tokenattributes.OffsetAttribute;
import org.apache.lucene.analysis.tokenattributes.TypeAttribute;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;

public class TokenizerRunTest {
    @Test
    public void analyzeTest() throws IOException {
        String testSource = "저는 이번에 바람과 함께 사라지다를 봤어요";
        KomoranTokenizer tokenStream = new KomoranTokenizer(new Komoran(DEFAULT_MODEL.FULL));
        tokenStream.setReader(new StringReader(testSource));
        tokenStream.reset();
        while (tokenStream.incrementToken()) {
            System.out.println(tokenStream.getAttribute(CharTermAttribute.class));
            System.out.println(tokenStream.getAttribute(TypeAttribute.class).type());
            System.out.println(tokenStream.getAttribute(OffsetAttribute.class).startOffset()
            +" : "+tokenStream.getAttribute(OffsetAttribute.class).endOffset());
        }
        tokenStream.end();
        tokenStream.close();

    }
}
