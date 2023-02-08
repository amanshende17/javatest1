import java.util.*; 

public class PrimeFactors {
public static void main(String[] args) {
computePrimeFactors(15);
}
public static void computePrimeFactors(int x) {
//TODO Add your implementation here
ArrayList<Integer> primes = new ArrayList<Integer>();
ArrayList<Integer> ans = new ArrayList<Integer>();
for(int i=1;i<=x;i++)
{
 boolean isPrime = true;
 for(int j=2;j<i;j++)
 {
     if(i%j == 0){
         isPrime = false;
         break;
     }
 }
 if(isPrime){
     primes.add(i);
 }
}
int num1 = Collections.max(primes);
ans.add(num1);
int num2=1;;
for(int r=1;r<= (x-num1);r++)
{
    if(x%2==0){
    if(num1+r==x){
        num2 = r;
        ans.add(num2);
    }
    }
    else
    {
        if(num1+r+1==x){
            num2=r;
            ans.add(num2);
            ans.add(1);
        }
    }
}
System.out.print(ans);
return;
}
}