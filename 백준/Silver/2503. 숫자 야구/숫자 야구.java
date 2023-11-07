import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int input_hint[] = new int[N+1];
		int input_s[] = new int[N+1];
		int input_b[] = new int[N+1];
		int answer = 0;
		
		for(int i=1; i<N+1; i++) {
			input_hint[i] = sc.nextInt(); // hint 숫자 
			input_s[i] = sc.nextInt(); // strike
			input_b[i] = sc.nextInt(); // ball 
			
		}
		
		for(int start = 123; start<=987; start++) {
			int a = start/100;
			int b = start%100/10;
			int c = start%10;
			int cnt = 0;
			
			for(int i=1; i<N+1; i++) {
				int input_anum = input_hint[i]/100;
				int input_bnum = input_hint[i]%100/10;
				int input_cnum = input_hint[i]%10;
				
				if(a==0 || b==0 || c==0) {
					continue;
				}
                if(input_anum==0 || input_bnum==0 || input_cnum==0) {
					continue;
				}
				if(a==b || b==c || c==a) {
					continue;
				}
				if(input_anum==input_bnum || input_bnum==input_cnum || input_cnum==input_anum) {
					continue;
				}
				
				int scnt = 0, bcnt = 0;
				
				if(a == input_anum) {
					scnt++;
				}
				if(b == input_bnum) {
					scnt++;
				}
				if( c == input_cnum) {
					scnt++;
				}
				
				if( a==input_bnum || a==input_cnum) {
					bcnt++;
				}
				if( b==input_anum || b==input_cnum) {
					bcnt++;
				}
				if( c==input_anum || c==input_bnum) {
					bcnt++;
				}
				
				
				if (input_s[i] == scnt && input_b[i] == bcnt) {
					cnt++;
				}
				
			}
			
			if(cnt == N) {
				answer++;
			}
			
		}
		
		System.out.println(answer);
		
	
    }
}
