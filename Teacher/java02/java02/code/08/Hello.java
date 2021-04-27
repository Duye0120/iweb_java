import java.util.Scanner; // 引入Scanner的地址

public class Hello{
	
	/**
	max: 形参
	int：返回值
	
	y=f(x)
	递归深度的问题
	每次方法的调用都会产生一个私有栈,  如果递归的深度过大 会产生 java.lang.StackOverflowError
	*/
	public int sum(int max){ // 1+2  // max 相当于是局部变量
		if(max==1){
			return 1;
		}else{
			return max + sum(--max);
		}
		// *****要求： 使用 三元表达式 代替上面的代码
	}
	
	// 递归
	public static void main(String[] args){
		
		// 计算1+2+3+....+100
		//循环实现
		
		/*
		int sum = 0; // 累计相加的和
		for(int i = 1;i<=100;i++){
			sum +=i;
		}
		System.out.println(sum);
		*/
		
		// 递归
		
		Hello hello = new Hello(); // 创建对象
		int sum = hello.sum(100);  // 如果递归的深度过大 会产生 java.lang.StackOverflowError
		
		System.out.println(sum);
		
	}
}













