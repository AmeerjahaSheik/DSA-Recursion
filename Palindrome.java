 class Palindrome {
    static int palindrome(int n,int sum){
        if(n==0){
            return sum;
        }
        sum= sum * 10 + n % 10;
        return palindrome(n/10,sum);

    }
    public static void main(String[] args) {
        int n=121;
        int result=palindrome(n,0);
        if(n==result){
            System.out.println("palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        
    }
    
}
