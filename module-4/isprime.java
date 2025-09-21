import java.util.*;

public class isprime {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int input_num = sc.nextInt(); sc.close();
        if(is_prime(input_num)){
            System.out.println("the number is a prime number.");
        }else{
            System.out.println("the number is not a prime number.");
        }
    }
    
    public static boolean is_prime(int n){
        if(n==1){
            return false;
        }else if(n==2 | n == 3 ){
            return true;
        }else{
            for(int i = 2; i <= Math.sqrt(n);i++){
                if(n%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}