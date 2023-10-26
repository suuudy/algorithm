import java.util.*;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
class Main {
    static int N;
	static int M;
	static StringBuilder sb;
	static int arr[];
	static boolean isUsed[];
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		sb = new StringBuilder();
		arr = new int[M+1];
		isUsed = new boolean[N+1];
		
		recur(0);
		//System.out.print(sb.toString().trim());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		
		bw.close();
		
	}
	public static void recur(int idx) {
		if(idx == M) {
			for(int i=0; i<M; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		
		for(int i=1; i<=N; i++) {
			if(!isUsed[i]) {
				isUsed[i] = true;
				arr[idx] = i;
				recur(idx + 1);
				isUsed[i] = false;
			}
		}
		
	}
}