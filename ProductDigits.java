public class ProductDigits {
    static int product(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)* product(n/10);
    }
    public static void main(String[] args) {
        int ans=product(25);


        System.out.println(ans);
    }
    
} 
