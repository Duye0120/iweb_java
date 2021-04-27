public class Hello{
	
	
	// 位运算符 : 性能高于 10进制的计算
	public static void main(String[] args){
		
		
		int a = 10; // 1010
		int b = 2;  // 0010 
		// 0010 = 2
		System.out.println(a & b); // 2
		System.out.println(a | b); // 10
		System.out.println(a ^ b); // 8
		System.out.println(~5); // 以-1 和 0 之间为中心点 取对面的数
		
		// 1000   >>  0100    << 0001 0000
		System.out.println(a >> 1); // 10/2  a>>1性能要高于 10/2
	}
	
}













