import java.util.*;

public class isprime {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        long input_num = sc.nextLong(); sc.close();
        if(is_prime(input_num)){
            System.out.println("the number is a prime number.");
        }else{
            System.out.println(factors(input_num));
            System.out.println("the number is not a prime number.");
        }
    }
    
    public static boolean is_prime(long n){
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

    public static List<Long> factors(long n){
        List<Long> facts = new ArrayList<>();
        for(long i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                facts.add(i);
                if(!facts.contains(n/i)){facts.add(n/i);};
            }
        }
        return facts;
    }
}