package java8.functionalinterface;
// Create a functional interface Checker with a method boolean check(int n).
// Implement it using a lambda to check if a number is prime. Test it on different numbers.

@FunctionalInterface
interface Checker{
    boolean check(int n);
}
public class IsPrime {

    public static void main(String[] args) {

        int num =17;
        Checker isprime = (n)->{

               if(n<=1)
                return false;
               else {
                    for(int i=2;i<=Math.sqrt(n);i++){
                        if(n%i==0)
                         return false;
                     }
                   }
                  return true;
               };

        System.out.println("IsPrime : "+isprime.check(num));
    }
}
