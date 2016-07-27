
public static void main(String args[]) {
 
        for(int i=1; i<=144; i++){
            System.out.print(i);
        }
    } 
    public static int (int num){
        if(num == 1 || num == 2){
            return 1;
        }
 
        return fibonacciRecusion(num-1) + fibonacciRecusion(num -2); 
    }
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
 
        }
        return fibonacci; 
    }     
}