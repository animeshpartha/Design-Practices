package MathProblem;

public class FindMissingNumber {

    public static void main(String[] args) {

        int [] array = new int[] {10,2,1,4,5,9,7,8,6};
        System.out.println(findMissingNumber(array,10));
    }

    public static int findMissingNumber(int [] Array, int n){
        int total = 0;
        int sum = 0;
        for (int i=0; i<n; i++){
            sum += i;
            }
            for(int i=0; i < Array.length; i++){
                total += i;
            
            }
            return (sum-total);
    }

}
