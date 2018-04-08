package site.wangchuan.seg;

import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.utility.TextUtility;
import org.junit.Test;
import com.hankcs.hanlp.seg.Segment;

import java.util.List;

public class SegmentTest extends Segment {
    @Test
    public void testSegment(){
        String str = "这是一个测试";
        atomSegment(str.toCharArray(),0, str.length());
    }
    @Test
    public void getCharType(){
        String s= "ni";
        System.out.println(TextUtility.charType(s));
    }
    @Test
    public void testSegment2(){
        String str = "这是一个测试";
        quickAtomSegment(str.toCharArray(),0, str.length());
    }

    @Override
    protected List<Term> segSentence(char[] sentence) {
        return null;
    }
}
