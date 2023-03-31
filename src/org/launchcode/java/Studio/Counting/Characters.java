package org.launchcode.java.Studio.Counting;
import java.util.HashMap;
import java.util.Scanner;
public class Characters {
    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter String: ");
        String userInput = inputObject.nextLine().toLowerCase();
//        String phrase = ("If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.");
        char[] charactersInString = userInput.toCharArray();
        HashMap<Character, Integer> characterCount = new HashMap<>();
//        System.out.println(charactersInString);
//        char count = 0;
        for (char letter : charactersInString) {
            if (characterCount.containsKey(letter)) {
                characterCount.put(letter, characterCount.get(letter) + 1);
            } else if (!characterCount.containsKey(letter)) {
                characterCount.put(letter, 1);
            }

            }
        System.out.println(characterCount);
        }


    }

