package seminars.third.hw;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("тест правильного подчета")
    void evenOddNumberTest() {
        assertTrue(4 % 2 == 0);
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
    void numberInIntervalLower(){
        assertTrue(24<25);
    }
    @Test
    void numberInIntervalHigher(){
        assertTrue(101>100);
    }
}