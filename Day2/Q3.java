public class Q3 {
    public static void main(String[] args) {
        int[] A = { 2, 4, 3, 5, 6 };
        int N = A.length;

        findSmallestAndSecondSmallest(A, N);
    }

    public static void findSmallestAndSecondSmallest(int[] A, int N) {
        if (N < 2) {
            System.out.println("-1");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (A[i] < smallest) {
                secondSmallest = smallest;
                smallest = A[i];
            } else if (A[i] < secondSmallest && A[i] != smallest) {
                secondSmallest = A[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(smallest + " " + secondSmallest);
        }
    }
}
