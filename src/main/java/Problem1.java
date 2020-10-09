public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] input, int target) {
        // Add your solution
        if (input == null|| input.length == 0 ){
            return -1;
        }
        int l = 0, r = input.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;


            if (input[m] == target)
                return m;


            if (input[m] < target)
                l = m + 1;


            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }



}

