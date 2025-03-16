public class three {
    public static void main(String args[]){
       int n = 4;
       for(int r=1; r<=n; r++){
        for(int j=1; j<=n-r; j++){
            System.out.print(" ");
        }
        for(int c=1; c<=r; c++){
            System.out.print("*");
        }
        System.out.println();
       } 
    } 
}