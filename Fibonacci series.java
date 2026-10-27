class Fibonacci{
    public static void main(String[] args) {

        System.out.println(fibonacci(6));
    }
    static int fibonacci(int n){
        //Base Condition.
        if(n<2){
            return n;
        }
        // recursive function
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
