class Reverse_help {
    static int reversefun(int n){
        return reverseHelper(n,0);
    }
    static int reverseHelper(int n,int sum){
        if(n==0){
            return sum;
        }
        sum=sum*10+n%10;
        return reverseHelper(n/10, sum);
    
    }
    public static void main(String[] args) {
        System.out.println(reversefun(1234));
    }

    
}
