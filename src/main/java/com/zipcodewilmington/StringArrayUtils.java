package com.zipcodewilmington;
// James Jang

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import org.apache.commons.lang3.ArrayUtils;
/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }
    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }
    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
//        List array2 = Arrays.asList(array);
//        return array2.contains(value);
        boolean found = false;
        for (int i = 0; i < array.length;i++) {
            if (array[i] == value){
                found = true;
            }
        } return found;
    }
    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        Collections.reverse(Arrays.asList(array));
        return array;
    }
    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO

    public static boolean isPalindromic(String[] array) {
        //        ArrayList<String> arr2 = new ArrayList<>();
//        Collections.addAll(arr2, array);
//        ArrayList<String> arr3 = new ArrayList<>();
//        Collections.addAll(arr3, array);
//        Collections.reverse(arr2);
//        return (arr2.equals(arr3));
        String[] reversed = Arrays.copyOf(array, array.length);
        Collections.reverse(Arrays.asList(reversed));
        return Arrays.equals(reversed,array);
    }
    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String phrase = Arrays.toString(array).toLowerCase();
        for (char i = 'a'; i <= 'z'; i++) {
            if (phrase.indexOf(i) == -1) {
                return false;
            }
        } return true;
    }
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (String s : array) {
            if (s.equals(value)) {
                count++;
            }
        }
        return count;
    }
    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> arrList = new ArrayList<>();
        for (String str : array) {
            arrList.add(str);
        }
        arrList.remove(valueToRemove);
        return arrList.toArray(new String[0]);
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].equals(valueToRemove)) {
//                array = ArrayUtils.removeElement(array,array[i]);
//            }
//        }
//        return array;
    }
    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> arrList = new ArrayList<>();
        Collections.addAll(arrList, array);
        for (int i = 0; i < array.length; i++) {
//            if (Objects.equals(arrList.get(i), arrList.get(i + 1))){
//                arrList.remove(arrList.get(i));
//                arrList.remove((arrList.get(i+1)));
//            }
        } return arrList.toArray(new String[0]);
    }
    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
