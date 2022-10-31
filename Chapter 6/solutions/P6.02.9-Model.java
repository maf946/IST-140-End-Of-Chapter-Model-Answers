public class Main
{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 4, 6, 7, 8, 9, 42};
        int[] arr2 = {2, 1, 3, 4, 5, 4, 7, 4, 9, 4};

        // Check if array 1 has adjacent dupes.
        // Assume no adjacent dupes.
        boolean adjDupes = false;

        // Loop through array, checking for duplicates
        // next to each other.
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] == arr1[i + 1]) {
                adjDupes = true;
            }
        }

        if (adjDupes) {
            System.out.println("Array contains adjacent duplicates.");
        } else {
            System.out.println("Array does NOT contain adjacent duplicates.");
        }
        System.out.println("Expected: Array contains adjacent duplicates.");

        // Check if array 1 has adjacent dupes.
        // Assume no adjacent dupes.
        adjDupes = false;

        // Loop through array, checking for duplicates
        // next to each other.
        for (int i = 0; i < arr2.length - 1; i++) {
            if (arr2[i] == arr2[i + 1]) {
                adjDupes = true;
            }
        }

        if (adjDupes) {
            System.out.println("Array contains adjacent duplicates.");
        } else {
            System.out.println("Array does NOT contain adjacent duplicates.");
        }
        System.out.println("Expected: Array contains adjacent duplicates.");
    }
}