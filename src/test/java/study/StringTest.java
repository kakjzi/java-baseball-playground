package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertThrows;

public class StringTest {

    @Test
    @DisplayName("replace 테스트")
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("Split 테스트")
    void 요구사항1() throws Exception {
        //"1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인
        String[] actual = "1,2".split(",");
        assertThat(actual[0]).isEqualTo("1");

        //"1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환
        String[] actual1 = "1".split(",");
        assertThat(actual1).contains("1");
        assertThat(actual1).containsExactly("1");
    }

    @Test
    @DisplayName("Substring 테스트")
    void 요구사항2() throws Exception {
        //"(1,2)" 값이 주어졌을 때 String 의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환
        String values = "(1,2)";
        String actual = values.substring(1, values.length() - 1);
        assertThat(actual).isEqualTo("1,2");
    }
    
    @Test
    @DisplayName("CharAt 테스트")
    void 요구사항3_1(){
        //"abc" 값이 주어졌을 때 String 의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현
        String str = "abc";
        assertThat(String.valueOf(str.charAt(0))).isEqualTo("a");
        assertThat(String.valueOf(str.charAt(1))).isEqualTo("b");
        assertThat(String.valueOf(str.charAt(2))).isEqualTo("c");
    }
    @Test
    @DisplayName("예외처리 테스트")
    public void 요구사항3_2() throws Exception {
        //String 의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때
        // 위치 값을 벗어나면 StringIndexOutOfBoundsException 이 발생하는 부분에 대한 학습 테스트를 구현

        String str = "abc";
        StringIndexOutOfBoundsException ex =
                assertThrows(StringIndexOutOfBoundsException.class, () ->{
            str.charAt(4); //exception 발생해야한다.
        });

    }
}
