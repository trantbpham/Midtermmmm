import java.util.Scanner;

public class BinarySearch() {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int inputArray[] = new int[num];
        for (int i = 0; i < num; i++) {
            inputArray[i] = input.nextInt();
        }


        int first = 0;
        int last = inputArray.length - 1;
        int mid = 0;

        while (first <= last) {
            mid = (first + last ) / 2;
            if (inputArray[mid] < num) {
                first = mid + 1;
            }
            if (inputArray[mid] > num) {
                last = mid - 1;
            }
            else {
                return mid;
            }

        }
    }



}