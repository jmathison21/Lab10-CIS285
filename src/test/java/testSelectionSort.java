import org.example.SelectionSort;
import org.junit.jupiter.api.*;

import java.util.Arrays;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class testSelectionSort {

    public testSelectionSort() {}

    @Test
    @Order(1)
    public void testPositive() {
        int[] positiveArr = {2,41,5,13,7,8};
        int[] sortedArr = {2,5,7,8,13,41};

        SelectionSort sorter = new SelectionSort();

        int[] sortedPositiveArr = sorter.basicSelectionSort(positiveArr);

        System.out.println("Original Array: " + Arrays.toString(positiveArr));
        System.out.println("Expected Array: " + Arrays.toString(sortedArr));
        System.out.println("Sorted Array: " + Arrays.toString(sortedPositiveArr));

        Assertions.assertArrayEquals(sortedArr,sortedPositiveArr);
    }

    @Test
    @Order(2)
    public void testNegative() {
        int[] negativeArr = {-3,-11,-8,-4,-65,-24};
        int[] sortedArr = {-65,-24,-11,-8,-4,-3};

        SelectionSort sorter = new SelectionSort();

        int[] sortedNegativeArr = sorter.basicSelectionSort(negativeArr);

        System.out.println("Original Array: " + Arrays.toString(negativeArr));
        System.out.println("Expected Array: " + Arrays.toString(sortedArr));
        System.out.println("Sorted Array: " + Arrays.toString(sortedNegativeArr));

        Assertions.assertArrayEquals(sortedArr,sortedNegativeArr);
    }

    @Test
    @Order(3)
    public void testMixed() {
        int[] mixedArr = {22,-11,5,50,-17,-8,94};
        int[] sortedArr = {-17,-11,-8,5,22,50,94};

        SelectionSort sorter = new SelectionSort();

        int[] sortedMixedArr = sorter.basicSelectionSort(mixedArr);

        System.out.println("Original Array: " + Arrays.toString(mixedArr));
        System.out.println("Expected Array: " + Arrays.toString(sortedArr));
        System.out.println("Sorted Array: " + Arrays.toString(sortedMixedArr));

        Assertions.assertArrayEquals(sortedArr,sortedMixedArr);
    }

    @Test
    @Order(4)
    public void testDuplicates() {
        int[] duplicatesArr = {-13,41,-13,20,6,6,-8};
        int[] sortedArr = {-13,-13,-8,6,6,20,41};

        SelectionSort sorter = new SelectionSort();

        int[] sortedDuplicatesArr = sorter.basicSelectionSort(duplicatesArr);

        System.out.println("Original Array: " + Arrays.toString(duplicatesArr));
        System.out.println("Expected Array: " + Arrays.toString(sortedArr));
        System.out.println("Sorted Array: " + Arrays.toString(sortedDuplicatesArr));

        Assertions.assertArrayEquals(sortedArr,sortedDuplicatesArr);
    }
}
