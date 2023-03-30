package org.launchcode.java;

public class Array {
    public static void main(String[] args) {
        int[] intArr = {1, 1, 2, 3, 5, 8};
        for (int interger: intArr) {
            if (interger % 2 != 0) {
                System.out.println(interger);
            }
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

    }
}
