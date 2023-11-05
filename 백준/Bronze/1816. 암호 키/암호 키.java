import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt(); //테스트케이스
        
        for(int k=0; k<TC; k++) { //테스트케이스 만큼 반복
            long input = sc.nextLong();
            
            for (int i=2; i<=1000000; i++) {
                if (input%i == 0) {//100만보다 작고 2이상의 약수가 존재한다
                    System.out.println("NO");
                    break;
                }
                if(i==1000000) { //100만 이하의 약수가 존재하지 않는다
                   System.out.println("YES");
                }
            }
        }
        
                                   
    }
}