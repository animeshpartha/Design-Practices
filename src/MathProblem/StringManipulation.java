package MathProblem;

public class StringManipulation {
	 public static void main(String[] args) {
	        
		 String str = "We are in Java Selenium Class";
	     String str1 = "We are in Java Selenium Class";

	        str.length();
	        System.out.println(str.length());
	        str.charAt(7);
	        System.out.println( str.charAt(7));
	        str.indexOf('i');
	        System.out.println(str.indexOf('i'));

	        str.indexOf('i',  str.indexOf('i')+1); // for second position of i
	        System.out.println(str.indexOf(str.indexOf('i')+ " & " , +'i' +str.indexOf('i')+1));

	        str.equals(str1);
	        System.out.println(str.equals(str1));

	        System.out.println(str.equalsIgnoreCase(str1));

	        /*String date = "01-01-2019"; // Charecter manipulation
	        date.replace("-","/");
	        System.out.println(date.replace("-","/"));*/

	        /*String x = "Hello";
	        String y = "World";
	        int a = 100;
	        int b = 200;
	        System.out.println(x+y);
	        System.out.println(a+b);
	        System.out.println(x+y+a+b);
	        System.out.println(a+b+x+y);
	        System.out.println((a+b)+(x+y));*/
	 }
}
