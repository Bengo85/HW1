import java.util.Arrays;

public class Assignment01Q04 {
    private static void shiftRightOnce(int[] array) {
        int length = array.length;
        int last = array[length - 1];

        for (int i = length-2; i >= 0; i--) {
            array[i+1] = array[i];
        }
        array[0] = last;
        return;
    }

    private static void shiftRightCyclic(int[] array, int move) {
        int iters = 0;
        while (iters < move) {
            shiftRightOnce(array);
            iters++;
        }
        return;
    }

    private static void shiftLeftOnce(int[] array) {
        int length = array.length;
        int first = array[0];

        for (int i = 1; i < length; i++) {
            array[i-1] = array[i];
        }
        array[length-1] = first;
        return;
    }

    private static void shiftLeftCyclic(int[] array, int move) {
        int iters = 0;
        while (iters < move) {
            shiftLeftOnce(array);
            iters++;
        }
        return;
    }

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (array.length == 0) return array;

        switch (direction) {
            case 'R':
                if (move >= 0) {
                    shiftRightCyclic(array, move);
                } else {
                    shiftLeftCyclic(array, -1 * move);
                }
                break;

            case 'L':
                if (move >= 0) {
                    shiftLeftCyclic(array, move);
                } else {
                    shiftRightCyclic(array, -1 * move);
                }
                break;

            default:
                return array;
        }
    
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}