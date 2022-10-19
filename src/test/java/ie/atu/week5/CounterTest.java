package ie.atu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    Counter myCount;

    @BeforeEach
    void setUp() {
        myCount = new Counter();
    }

    @Test
    void testAdd(){
        assertEquals(1, myCount.add());
    }

    @Test
    void testConstructor(){
        assertThrows(IllegalAccessException.class, () -> {new Counter(4);});
    }

    @AfterEach
    void tearDown() {
    }
}