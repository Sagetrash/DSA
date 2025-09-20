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
        int count = 0;
        for(int i = 1; i <=n; i++){
            if(n%i == 0){
                count += 1;
            }
        }
        if(count == 2){
            return true;
        }else{
            return false;
        }
    }
}