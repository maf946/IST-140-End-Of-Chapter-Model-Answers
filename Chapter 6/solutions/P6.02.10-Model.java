public class Main
{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 42};
        int[] arr2 = {2, 1, 3, 4, 5, 4, 7, 4, 9, 4};

        // Check if array 1 has dupes.
        // Assume no dupes.
        boolean dupes = false;

        // Loop through array, checking for duplicates
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    dupes = true;
                }
            }
        }
        if (dupes) {
            System.out.println("Array contains duplicates.");
        } else {
            System.out.println("Array does NOT contain duplicates.");
        }
        System.out.println("Expected: Array does NOT contain duplicates.");

        // Check if array 2 has dupes.
        // Assume no dupes.
        dupes = false;

        // Loop through array, checking for duplicates
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] == arr2[j]) {
                    dupes = true;
                }
            }
        }
        if (dupes) {
            System.out.println("Array contains duplicates.");
        } else {
            System.out.println("Array does NOT contain duplicates.");
        }
        System.out.println("Expected: Array does NOT contain duplicates.");
    }
}