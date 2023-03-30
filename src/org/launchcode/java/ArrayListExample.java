package org.launchcode.java;
import java.util.ArrayList;
public class ArrayListExample {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(11);
        list.add(20);
        list.add(30);
        list.add(52);
        list.add(9);
        list.add(1);
        list.add(7);
        list.add(37);
        list.add(15);
        System.out.println(sumEven(list));
    }
}
