public class Q1_BinarySearch() {

    private int floor;

    public Q1_BinarySearch(int x) {
        floor = x;
    }
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        int inputArray[] = new int[num];
//        for (int i = 0; i < num; i++) {
//            inputArray[i] = input.nextInt();
//        }

    public int findFloor() {
        int first = 0;
        int last = floor;
        int mid = 0;

        while (first <= last) {
            mid = (first + last ) / 2;
            if (mid < floor) {
                first = mid + 1;
            }
            if (mid > floor) {
                last = mid - 1;
            }
            if (first > last) {
                throw new IllegalStateException(floor + "Not Found");
            }

        }
        return mid;
    }

    public static void main(String[] args) {
        int x = 1000;
        Q1_BinarySearch array = new Q1_BinarySearch(x);
        System.out.println("result" + array);

    }

}