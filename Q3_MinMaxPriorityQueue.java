import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/** Min/max priority queue. Design a data type that supports the following operations:
 * insert, delete the maximum, and delete the minimum (all in logarithmic time);
 * and ﬁnd the maximum and ﬁnd the minimum (both in constant time).
 * Hint: Use two heaps.
 */

public class Q3_MinMaxPriorityQueue {

    Set<Integer> queues;

    public Q3_MinMaxPriorityQueue() {
        queues = new HashSet<Integer>();
    }

    void insertNum(int x) {
        queues.add(x);
        System.out.print("Successfully added " + x);
    }

    void deleteMax() {
        if (queues.size() == 0) {
            System.out.print("size is 0");
            return;
        }
        queues.remove(Collections.max(queues,null));
    }

    void deleteMin() {
        if (queues.size() == 0) {
            System.out.print("size is 0");
            return;
        }
        queues.remove(Collections.min(queues, null));
    }
    int findMin() {
        return Collections.min(queues, null);
    }

    int findMax() {
        return Collections.max(queues, null);
    }

public static void main(String[] args) {
        Q3_MinMaxPriorityQueue newQueue = new Q3_MinMaxPriorityQueue();
        newQueue.insertNum(66);
        newQueue.insertNum(72);
        newQueue.insertNum(10);
        newQueue.insertNum(4);

        System.out.println(newQueue.findMin());
        System.out.println(newQueue.findMax());

}
}
