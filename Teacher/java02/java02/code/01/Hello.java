public class Hello{
	
	
	// 预算符
	public static void main(String[] args){
		
		// 1. 运算符的左右必须是相同的数据类型才能进行计算
		int a = 10;
		int b = 3;
		
		float c = 9.8F;
		
		System.out.println(a+b);
		System.out.println(a+c); // float 
		// 2. + 运算符 的一边是 String 类型的时候实现的是 + 连接
		char c1 = 'A';
		char c2 = 'B';
		System.out.println(c1 + "" + c2);
		
		// 3 %
		System.out.println(a%b); // 1
		
		// 4 自增
		int x = 1;
		x = x + 2; // 自增
		System.out.println(x);
		// 简写
		x += 2; // *=  /=  -=
		System.out.println(x);
		// 自增是1 可以使用 ++ 
		x += 1; // x++;  ++x;
		
		// ++ 在前先运算再引用   ++ 在后先引用再运算   -- 和++ 的计算方式一样的
		x = 1; // 对x重新赋值
		System.out.println(x++); // 1
		System.out.println(x); // 2
		x = 1; // 对x重新赋值
		System.out.println(++x); // 2
		System.out.println(x); // 2
		
		
	}
	
}













