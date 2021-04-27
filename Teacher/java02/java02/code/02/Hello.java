public class Hello{
	
	
	// 关系运算符： 运算的结果都是一个 布尔型
	// 逻辑运算符
	public static void main(String[] args){
		
		int a = 10;
		int b = 20;
		System.out.println(a>b); // false
		
		
		// System.out.println(3>5&&5>3); // false
		// System.out.println(6>5&&5>3); // true
		
		// System.out.println(3>5||1>3); // false
		// System.out.println(3>5||5>3); // true
		// System.out.println(6>5||5>3); // true
		
		// 短路现象
		int i = 1;
		System.out.println(3>5 && i++ == 1); // false
		System.out.println(i); // 1
		i = 1;
		// 运算符左右运算后的结果决定了整个表达式的结果
		System.out.println(3>5 & i++ == 1); // false
		System.out.println(i); // 2
	}
	
}













