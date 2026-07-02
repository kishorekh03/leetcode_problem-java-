package pattern;

public class p5 {
    
    public static void main(String[] args) {

        int n = 5;
        int count = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n ; j++) {
                count++;
                if(count<=9){
                    System.out.print("0"+count+" ");
                }
                 else{
                    System.out.print(count+" ");
                }
                
            }

            System.out.println();
        }
    }
}
