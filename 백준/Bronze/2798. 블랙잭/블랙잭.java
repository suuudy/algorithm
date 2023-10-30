import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0; int result = 0;
		for(int i=0; i<N-2; i++) {
			for(int k=i+1; k<N-1; k++) {
				for(int u=k+1; u<N; u++) {
					sum = arr[i] + arr[k] + arr[u];
					
					if(sum == M) {
						result = sum;
						break;
					}
					
					if(result < sum && sum < M) {
						result = sum;
					}
				}
			}
		}
		
		System.out.println(result);
    }
}