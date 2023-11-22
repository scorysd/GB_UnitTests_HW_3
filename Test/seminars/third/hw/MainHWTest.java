package seminars.third.hw;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {
    public static MainHW mh;

    @BeforeEach
    void setUp() {
        MainHW mh = new MainHW();
    }

    @AfterEach
    void tearDown() {
        mh = null;
    }

    @Test
    @DisplayName("тест правильного подчета")
    void evenOddNumberTest() {
        Assertions.assertTrue(this.mh.evenOddNumber(2));
        Assertions.assertFalse(this.mh.evenOddNumber(3));

    }

    @Test
    @DisplayName("проверка входящего парамаетра")
    void intTest() {
        Assertions.assertInstanceOf(Integer.class, 4);
    }

    @Test
    @DisplayName("проверка входящего парамаетра")
    void numberInIntervalTest() {
        Assertions.assertInstanceOf(Integer.class, 25);
    }
    @Test
    void numberInIntervaTest(){
        Assertions.assertTrue(this.mh.numberInInterval(26));
        Assertions.assertFalse(this.mh.numberInInterval(2));

    }
}