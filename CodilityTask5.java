public class Run {

    public static int solution() {
        int[] Tab = new int[]{2, 3, 1, 5};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < Tab.length; i++) {
            sum1 += i + 1;
            sum2 += Tab[i];
        }

        return ((sum1 + Tab.length) - sum2) + 1;
    }

}