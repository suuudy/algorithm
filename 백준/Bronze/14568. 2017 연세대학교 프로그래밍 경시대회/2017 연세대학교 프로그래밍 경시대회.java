import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        
        for (int A=0; A<=N; A++) {
            for(int B=0; B<=N; B++) {
                for(int C=0; C<=N; C++){
                    if(A+B+C == N) 
                        if (A >= B+2) 
                            if (A!=0 && B!=0 && C!=0) 
                                if (C%2==0) 
                                    answer++;
                    }
            }
        
        }
        System.out.println(answer);
    }
    
}