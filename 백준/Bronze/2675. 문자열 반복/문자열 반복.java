import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        
        for(int i=0; i<TC; i++) {
            int repeat = sc.nextInt(); //반복횟수 
            String str = sc.next(); //문자열 
            String str_sum = "";
            
           for(int str_repeat = 0; str_repeat<str.length(); str_repeat++) {
        	   for(int k=0; k<repeat; k++)
        	   str_sum += str.charAt(str_repeat);
           }
           System.out.println(str_sum);   
            
            
            
        }
    }
}