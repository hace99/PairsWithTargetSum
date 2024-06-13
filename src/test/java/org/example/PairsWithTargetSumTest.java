package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PairsWithTargetSumTest {
    @Test
    public void testPairsWithValue() {
        // Test case 1: Array with pairs that sum to the target
        int[] array1 = {1, 2, 3, 4, 5};
        int targetSum1 = 7;
        PairsWithTargetSum.pairs_value(array1, targetSum1);

        // Test case 2: Array with no pairs that sum to the target
        int[] array2 = {1, 2, 3, 4, 5};
        int targetSum2 = 10;
        PairsWithTargetSum.pairs_value(array2, targetSum2);

        // Test case 3: Empty array
        int[] array3 = {};
        int targetSum3 = 5;
        PairsWithTargetSum.pairs_value(array3, targetSum3);

        // Test case 4: Array with only one element
        int[] array4 = {6};
        int targetSum4 = 6;
        PairsWithTargetSum.pairs_value(array4, targetSum4);
    }

    @Test
    public void testMultiplePairs() {
        // Test case: Array with multiple pairs that sum to the target
        int[] array = {3, 4, 2, 7, 1, 5, 6, 8};
        int targetSum = 10;
        PairsWithTargetSum.pairs_value(array, targetSum);
    }

    @Test
    public void testRepeatedNumbers() {
        // Test case: Array with repeated numbers that sum to the target
        int[] array = {2, 3, 4, 3, 5, 6, 4};
        int targetSum = 8;
        PairsWithTargetSum.pairs_value(array, targetSum);
    }

    @Test
    public void testNegativeNumbers() {
        // Test case: Array with negative numbers that sum to the target
        int[] array = {2, -3, 4, -7, 1, 5, -6, 8};
        int targetSum = -1;
        PairsWithTargetSum.pairs_value(array, targetSum);
    }

    @Test
    public void testConsecutiveNumbers() {
        // Test case: Array with consecutive numbers that sum to the target
        int[] array = {1, 2, 3, 4, 5, 6};
        int targetSum = 7;
        PairsWithTargetSum.pairs_value(array, targetSum);
    }

    @Test
    public void testConsecutiveNumbers2() {
        // Test case: Array with consecutive numbers that sum to the target
        int[] array = {1, 2, 3, 4, 5, 6};
        int targetSum = 7;
        PairsWithTargetSum.pairs_value(array, targetSum);
    }
}

