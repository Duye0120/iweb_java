import java.util.Scanner;

public class Hello{
	
	public static void main(String[] args){
		
		
		// 字符串转int
		int num = Integer.parseInt(args[0]);
		System.out.println(num+100);
		
		// 字符串比较
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		System.out.println(x+100);
		
		double d = sc.nextDouble();
		System.out.println(d+100);
		
		// sc.nextLine();// 接一下上面的换行
		
		String str = sc.next(); // 下一个字符串
		
		System.out.println(str);
		
		
		System.out.println("line");
		String line = sc.next(); // 以换行为分界点
		System.out.println(line);
		
		// 字符串的比较使用 equals
		if("abc".equals(line)){
			System.out.println("YES");
		}
		
	}
	
}