package Arrays_Recursion.Patterns_Recursion;

public class Triangle1 {
    public static void main(String[] args) {
        triangle1(4, 0);
        
    }
    static void triangle1(int r, int c){
        //: Base condition-all rows completed so recursion stopss
        if(r==0){
            return;
        }if(c<r){
            System.out.print("*");
            triangle1(r, c+1);
        }else{
            System.out.println();
            triangle1(r-1, 0);
        }
    }
    
}
