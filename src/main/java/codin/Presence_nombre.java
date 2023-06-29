package main.java.codin;
// le but est de verifier la presence dun nombre dans un tableau.
public class Presence_nombre {
    static boolean exists(int[] ints, int k) {
        for(int i = 0; i < ints.length; i++) {
            if(ints[i] == k) {
                return true;
            }
        }
        return false;
    }


/*
    static boolean exists(int[] ints, int k) {
        int low = 0;
        int high = ints.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (ints[mid] == k) {
                return true;
            } else if (ints[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
*/

}
