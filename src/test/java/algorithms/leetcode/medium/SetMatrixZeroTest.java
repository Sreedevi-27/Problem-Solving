package algorithms.leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SetMatrixZeroTest {
    @Test
    void setMatrixZero(){
        int[][] expectedMatrix = new int[][]{{0,0,0,0},{0,4,5,0},{0,3,1,0}};
        int[][] actualMatrix = SetMatrixZero.setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
        assertArrayEquals(expectedMatrix, actualMatrix);
    }
}