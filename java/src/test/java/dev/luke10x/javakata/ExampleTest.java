package dev.luke10x.javakata;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExampleTest {
    @Test
    public void whenBoardIsEmptyGameIsNotOver() throws Exception {
        final String[][] emptyBoard = {
            {null, null, null},
            {null, null, null},
            {null, null, null},
        };
        final boolean result = Example.isGameOver(emptyBoard);
        assertThat(result, is(false));
    }
}
