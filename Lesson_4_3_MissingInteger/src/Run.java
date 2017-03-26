import java.util.HashSet;
import java.util.Set;

/**
 * Write a function:
 * that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in A.
 * For example, given:
 * A[0] = 1 A[1] = 3 A[2] = 6 A[3] = 4 A[4] = 1 A[5] = 2
 * the function should return 5.
 * Assume that:
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 * Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 * Created by Dawid Tracz on 26.03.2017.
 */
public class Run {
    public static void main(final String[] args) {
        int[] A = new int[]{1, 3, 6, 4, 1, 2};
        solution(A);
    }

    public static void solution(int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int i : A) {
            set.add(i);
        }
        int m = 1;
        while (set.contains(m)) {
            m++;
        }
        System.out.println(m);
    }
}
