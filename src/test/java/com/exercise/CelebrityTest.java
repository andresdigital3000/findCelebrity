package com.exercise;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class CelebrityTest {

    /*
        A0   B1  C2  D3
    A0   0   0   1   0
    B1   0   0   1   0
    C2   0   0   0   0
    D3   0   0   1   0
    */
    int [][] matrix = {{0,0,1,0},{0,0,1,0},{0,0,0,0},{0,0,1,0}};
    String [] people = {"A0", "B1", "C2", "D3" };

    @InjectMocks
    Celebrity mockCelebrity;

    @BeforeEach
    void setUp() {
        mockCelebrity = new Celebrity();
        mockCelebrity.setMatrix(matrix);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isCelebrityShouldReturnFalse() {
        boolean isCelebrity = mockCelebrity.isCelebrity("A0", people, 0);
        Assertions.assertEquals(isCelebrity, false);
    }

    @Test
    void isCelebrityShouldReturnTrue() {
        boolean isCelebrity = mockCelebrity.isCelebrity("C2", people, 0);
        Assertions.assertEquals(isCelebrity, true);
    }

    @Test
    void doKnowShouldReturnFalse() {
        String originPerson = "A0";
        String destinyPerson = "B1";
        boolean isKnown = mockCelebrity.doKnow(originPerson, destinyPerson);
        Assertions.assertEquals(isKnown, false);

    }

    @Test
    void doKnowShouldReturnTrue() {
        String originPerson = "A0";
        String destinyPerson = "C2";
        boolean isKnown = mockCelebrity.doKnow(originPerson, destinyPerson);
        Assertions.assertEquals(isKnown, true);

    }

    @Test
    void shouldReturnCelebrity() {
        String celebrity = "";
        for (String item : people) {
            if (mockCelebrity.isCelebrity(item, people, 0)) {
                celebrity = item;
                break;
            }

        }
        Assertions.assertEquals(celebrity, "C2");
    }
}