class FibonacciMemoArray {
    static int[] memo;
    static int fib(int n) {
        if (n <= 1)         // Base cases
            return n;
        if (memo[n] != -1) // If already computed, return from array
            return memo[n];
        memo[n] = fib(n - 1) + fib(n - 2); // Compute and store
        return memo[n]; 
    }
    public static void main(String[] args) {
        int n = 10;                 // change as needed
        memo = new int[n + 1];      // array size
        // Initialize array with -1 
        for (int i = 0; i <= n; i++)
            memo[i] = -1;
        System.out.println(fib(n));
    }
}