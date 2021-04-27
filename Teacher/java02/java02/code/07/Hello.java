import java.util.Scanner; // 引入Scanner的地址

public class Hello{
	
	// 循环
	public static void main(String[] args){
		
		// for
		/*
		
		for(声明;条件表达式;增量表达式){
			// TO DO 循环体
		}
		*/
		
		// 输出 1 -> 10
		/*
		int i = 1;
		for(;i <= 10; i++){
			// int i = 1 作用域 是当前这对花括号
			System.out.println(i);
		}
		
		System.out.println(i); // 11
		*/
		
		
		// while
		/*
		
		while(condition){
			// 循环体
		}
		
		*/
		
		// 1 - 10
		
		/*
		int x = 1;
		while(x <= 10){
			System.out.println(x);
			x++; // ***************增量表达式
		}
		*/
		
		// do{循环体}while(condition) ： 无论条件是否满足都会执行一次
		
		int x = 20;
		do{
			System.out.println(x);
			x++;
		}while(x<=10);
		
		
	}
}













