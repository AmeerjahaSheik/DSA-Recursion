class Reverse {

    static int reverse(int n, int sum) {
        if (n == 0) {
            return sum;
        }

        sum = sum * 10 + n % 10;

        return reverse(n / 10, sum);
    }

    public static void main(String[] args) {
        int result = reverse(1234, 0);
        System.out.println(result);
    }
}