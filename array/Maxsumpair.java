package array;

public class Maxsumpair {
    public static void main(String[] args) {
        int[] arr={3,2,7,4,9};
        int highest=Integer.MIN_VALUE;
        int sechighest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(highest<arr[i]){
                sechighest=highest;
                highest=arr[i];
            }
            else if(sechighest<arr[i] && sechighest!=highest){
                sechighest=arr[i];
            }
        }
        int sum=highest+sechighest;
        System.out.println("two highest pair are "+highest+" + "+sechighest+" : "+sum);
        
    }
    
}
