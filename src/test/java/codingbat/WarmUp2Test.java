package codingbat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarmUp2Test {

    @Test
    public void countXXTest(){
        //given
        String sourse = "abcxx";
        //when
        //then
        int expected = 1;

        int actual = WarmUp2.countXX(sourse);
        assertEquals(expected,actual);
    }

    @Test
    public void has271Test(){
        // given
        int[] source = {2,7,1,0,10};
        // when

        //then
        boolean expected = true;
        boolean actual = WarmUp2.has271(source);
        assertEquals(expected, actual);
    }
    @Test
    public void stringMatchTest(){
        //given
        String aSource = "xxcaazz";
        String bSource = "xxbaaz";
        //when

        //then
        int expected = 3;
        int actual = WarmUp2.stringMatch(aSource,bSource);
        assertEquals(expected,actual);
    }
}
