package pl.edu.ur.POLab3;

public class Funkcje {
    public static void main(String args[]){
        
     System.out.println(pow(2,9));
     System.out.println(fib(0));
    }   
    
    public static double pow(double podstawa, double wykladnik) {
        if (wykladnik == 0)
            return 1;
        if (wykladnik % 2 == 1)
            return pow(podstawa, wykladnik - 1) * podstawa;
        else {
            double a = pow(podstawa, wykladnik / 2);
            return a * a;
        }
    }
    public static int fib(int n){
        if (n==0){
            return 0;
        }else if ((n==1)||(n==2)){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }   
    }

}
