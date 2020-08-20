public class factorial {

    public static int factorial(int n){
        int value ;
        if(n ==  0){
        	return 1;}
            else{
            	return (n*factorial(n-1));
            }
    }
    public static void main(String args[]){
        System.out.print("enter no. to find factorial");
        System.out.println(factorial(5));
        }           
}