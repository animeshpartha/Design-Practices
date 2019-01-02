package MathProblem;

public class Factorial {

	public static void main(String[] args) {
		//Factorial of 5
        //using interation

        int n = 13;
        int result = 1;
        for(int i = 1; i <= n; i++){
            result = result * i;
            System.out.println("This Factorial of 5 variable is: " +result);
        }

        System.out.println("This Factorial of 5 is: " +result);

        System.out.println("This Factorial of 5 is: " + facrtoirial(5));
    }


    //Factorial of 5
    //using interation
    public static int facrtoirial(int n){
        if (n==0){
            return 1;

        }else{
            return n *  (n = n-1);
        }

    }

	}

