package Strings;

public class SkipCharacter {
    public static void main(String[] args) {
        skip("","bccadah");

        
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
        }
        char ch=up.charAt(0);

        if(ch=='a'){
            skip(p,up.substring(1));
        }
    }

    
}
