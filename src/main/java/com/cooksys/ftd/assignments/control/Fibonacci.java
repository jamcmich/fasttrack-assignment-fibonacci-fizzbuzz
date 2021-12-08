package com.cooksys.ftd.assignments.control;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * The Fibonacci sequence is simply and recursively defined: the first two elements are `1`, and
 * every other element is equal to the sum of its two preceding elements. For example:
 * <p>
 * [1, 1] =>
 * [1, 1, 1 + 1]  => [1, 1, 2] =>
 * [1, 1, 2, 1 + 2] => [1, 1, 2, 3] =>
 * [1, 1, 2, 3, 2 + 3] => [1, 1, 2, 3, 5] =>
 * ...etc
 */
public class Fibonacci {

    /**
     * Calculates the value in the Fibonacci sequence at a given index. For example,
     * `atIndex(0)` and `atIndex(1)` should return `1`, because the first two elements of the
     * sequence are both `1`.
     *
     * @param i the index of the element to calculate
     * @return the calculated element
     * @throws IllegalArgumentException if the given index is less than zero
     */
    public static int atIndex(int i) throws IllegalArgumentException {
//        throw new NotImplementedException();
        if (i < 0) { // if 'i' is less than 0...
            throw new IllegalArgumentException(); // ...throw exception
        }

        if (i == 0) { // if 'i' is equal to 0...
            return 1; // ...return 1
        }

        int[] newArray = new int[i + 1]; // since arrays start at 0
        newArray[0] = 1; // base case
        newArray[1] = 1; // base case

        for (int j = 2; j < newArray.length; j++) {
            newArray[j] = newArray[j - 1] + newArray[j - 2];
        }

        /*
            ex: int[] fibArray = [1, 1, 2, 3, 5...],
            if 'i' = 4, valueAtIndex = (i - 1) + (i - 2) = 3 + 2 = 5
        */
        return newArray[i];
    }

    /**
     * Calculates a slice of the fibonacci sequence, starting from a given start index (inclusive) and
     * ending at a given end index (exclusive).
     *
     * @param start the starting index of the slice (inclusive)
     * @param end   the ending index of the slice(exclusive)
     * @return the calculated slice as an array of int elements
     * @throws IllegalArgumentException if either the given start or end is negative, or if the
     *                                  given end is less than the given start
     */
    public static int[] slice(int start, int end) throws IllegalArgumentException {
//        throw new NotImplementedException();
        return null;
    }

    /**
     * Calculates the beginning of the fibonacci sequence, up to a given count.
     *
     * @param count the number of elements to calculate
     * @return the beginning of the fibonacci sequence, up to the given count, as an array of int elements
     * @throws IllegalArgumentException if the given count is negative
     */
    public static int[] fibonacci(int count) throws IllegalArgumentException {
//        throw new NotImplementedException();
        return null;
    }
}
