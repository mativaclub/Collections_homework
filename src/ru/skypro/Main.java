package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("прыг", "скок", "мяу", "квак", "прыг", "скок", "рык"));
        printOddNumbers(nums);
        System.out.println();
        printUniqueEvenNumbers(nums);
        System.out.println();
        printUniqueWords(words);
        System.out.println();
        printDoublesSize(words);
    }

    public static void printOddNumbers(List<Integer> nums) {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void printUniqueEvenNumbers(List<Integer> nums) {
        List<Integer> uniqueEvenNumbers = new ArrayList<>(Set.copyOf(nums));
        Collections.sort(uniqueEvenNumbers);
        uniqueEvenNumbers.removeIf(num -> num % 2 != 0);
        for (Integer num:uniqueEvenNumbers) {
                System.out.print(num + " ");
            }
        }

    public static void printUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        List<String> duplicates = new ArrayList<>(words);
        for (String uniqueWord:uniqueWords) {
            duplicates.remove(uniqueWord);
        }
        uniqueWords.removeAll(duplicates);
        System.out.println(uniqueWords);
    }

    public static void printDoublesSize(List<String> words) {
        Set<String> doubles = new HashSet<>(words);
        System.out.println(words.size()-doubles.size());
    }





    }


