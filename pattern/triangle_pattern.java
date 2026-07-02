package pattern;

public class triangle_pattern {

    public static void main(String[] args) {

        int n = 5;
        int count = 1;

        // Star Triangle Pattern
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();

        // Number Triangle Pattern
        for (int i = 1; i < n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(count + " ");
                
            }
            count++;
            System.out.println();
        }
        System.out.println();
        
         for (int i = 1; i < n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");
                
            }
            
            System.out.println();
        }
    }
}