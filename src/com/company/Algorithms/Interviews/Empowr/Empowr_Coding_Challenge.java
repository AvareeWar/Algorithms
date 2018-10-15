package com.company.Algorithms.Interviews.Empowr;

import org.junit.Test;

import java.util.Arrays;

public class Empowr_Coding_Challenge {

    public static class PuzzleSolver {
        public static String[] DICTIONARY = {"OX", "CAT", "TOY", "AT", "DOG", "CATAPULT", "T"};


        static Boolean IsWord(String testWord) {
            if (Arrays.asList(DICTIONARY).contains(testWord))
                return true;
            return false;
        }

        ///////////////////////////////////////////////////////////////
        public static int FindWords(char[][] puzzle) {

            int count = 0;

            String horizontal = "";
            String vertical = "";
            String diagonal = "";

            for (int row = 0; row < puzzle.length; row++) {
                for (int col = 0; col < puzzle[row].length; col++) {

                    horizontal += puzzle[row][col];
                    vertical += puzzle[col][row];

                    count += countSubstrings(horizontal);
                    count += countSubstrings(vertical);

                    horizontal = "";
                    vertical = "";

                    int dim = puzzle.length;
                    for( int k = 0 ; k < dim * 2 ; k++ ) {
                        for (int j = 0; j <= k; j++) {
                            int i = k - j;
                            if (i < dim && j < dim) {
                                diagonal += puzzle[i][j];
                            }
                        }
                    }

                    count += countSubstrings(diagonal);
                    diagonal = "";

                }
            }
            System.out.println(count);
            return count;
        }

        public static String reverseWord(String str) {
            String item = "";
            char c;
            for (int i = str.length() - 1; i >= 0; i--) {
                c = str.charAt(i);
                item += c;
            }
            return item;
        }

        public static int countSubstrings(String str) {

            //counts all possible substrings withing word
            int count = 0;

            for(int i = 0; i < str.length(); i++){
                for(int j = i+1; j <= str.length(); j++) {
                    if (IsWord(str.substring(i, j)) /*|| IsWord(reverseWord(str.substring(i,j)))*/) {
                        count++;
                    }
                }
            }
            return count;
        }

        //////////////////////////////////////////////////////////////

        //https://stackoverflow.com/questions/26303445/looking-for-words-in-a-2d-array-of-chars-in-java-why-am-i-having-search-problem
        //https://stackoverflow.com/questions/42406333/how-can-i-check-if-a-diagonal-element-in-2d-array-is-occupied

        @Test
        public void testproblem() {
            char[][] multi = new char[][]{
                    //SHOULD BE 8 WAYS
                    {'C','A','T'},
                    {'X','Z','T'},
                    {'Y','O','T'},

            };

            FindWords(multi);
        }


    }
}
