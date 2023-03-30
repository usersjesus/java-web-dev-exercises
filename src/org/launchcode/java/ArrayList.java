package org.launchcode.java;

public class ArrayList {
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
        ArrayList<Interger> list = new ArrayList();
        list = [0,6,9,4,3,66,81,63,7,6];

        sumEven(list);
    }
}
