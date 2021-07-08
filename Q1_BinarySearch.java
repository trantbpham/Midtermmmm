public class Q1_BinarySearch {

    private int floor;
    private int count = 0;

    public Q1_BinarySearch(int x) {
        floor = x;
    }

    public double findFloor() {
        int first = 0;
        int last = floor;
        int mid = 0;

        while (first <= last) {
            mid = (first + last ) / 2;
            count++;
            if (mid < floor) {
                first = mid + 1;

            }
            if (mid > floor) {
                last = mid - 1;
            }
            if (first > last) {
                throw new IllegalStateException(floor + "Not Found");
            }
            if (mid == floor) {
                return mid;
            }
        }
        return mid;
    }

    public int getCount(){
        return count;
    }

//    public static void main(String[] args) {
//        int min = 50;
//        int max = 100;
//        double averageCount = 0;
//        int inputArray[] = new int[10000];
//
//        for (int x = 0; x < 10000; x++) {
//            int f = (int) Math.floor(Math.random() * (max - min + 1) + min);
//            Q1_BinarySearch array = new Q1_BinarySearch(f);
//            double result = array.findFloor();
//           averageCount += array.getCount();
//
//
//        }
//
//        averageCount = averageCount / 10000;
//
//        System.out.println("average count" + averageCount);
//        System.out.println("log(f)" + Math.log(10000));
//        return;
//
//    }

}