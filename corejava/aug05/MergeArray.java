package corejava.aug05;

public class MergeArray {

        public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4, 5}; // First array
            int[] array2 = {6, 7, 8, 9, 10}; // Second array

            // Determine the length of the new array
            int[] mergedArray = new int[array1.length + array2.length];

            // Copy elements from the first array
            for (int i = 0; i < array1.length; i++) {
                mergedArray[i] = array1[i];
            }

            // Copy elements from the second array
            for (int i = 0; i < array2.length; i++) {
                mergedArray[array1.length + i] = array2[i];
            }

            // Print the merged array
            System.out.print("Merged Array: ");
            for (int i = 0; i < mergedArray.length; i++) {
                System.out.print(mergedArray[i] + " ");
            }
        }
    }


