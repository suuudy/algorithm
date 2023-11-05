import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result = 0;
		char[] arr = new char[N];
		
		for(int start = 1; start<=N; start++) {
			String str = Integer.toString(start);
			int sum = start;
			for(int i=0; i<str.length(); i++) {
				arr[i] = str.charAt(i);
				sum += Character.getNumericValue(arr[i]);
			}
			
			if(sum == N) {
				result = start;
				break;
			} 
			
		}
		
		System.out.println(result);
    }
}