public class Factorial {
    static int Factorial(int n){
        //Base condition 
        if(n<=1){
            return 1;
        }
        return n*Factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }
    
}
