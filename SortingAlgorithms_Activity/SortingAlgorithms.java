
package sortingalgorithms;

import java.util.Arrays;

public class SortingAlgorithms {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] originalArray = {
            45, 12, 78, 3, 56, 23, 89, 10, 34, 67
        };

        int[] bubbleArray = originalArray.clone();
        int[] selectionArray = originalArray.clone();
        int[] insertionArray = originalArray.clone();

        System.out.println("SORTING ALGORITHMS");

        System.out.println("Original Array: "
                + Arrays.toString(originalArray));

        bubbleSort(bubbleArray);
        System.out.println("\nBubble Sort: "
                + Arrays.toString(bubbleArray));

        selectionSort(selectionArray);
        System.out.println("Selection Sort: "
                + Arrays.toString(selectionArray));

        insertionSort(insertionArray);
        System.out.println("Insertion Sort: "
                + Arrays.toString(insertionArray));
    }
}
