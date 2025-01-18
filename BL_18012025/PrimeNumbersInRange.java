public class PrimeNumbersInRange {
    public static boolean isPrime(int N) {
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int cnt = 0;
        int num = 2;

        while (cnt < 10) {
            if (isPrime(num)) {
                System.out.println(num);
                cnt++;
            }
            num++;
        }
    }
}
