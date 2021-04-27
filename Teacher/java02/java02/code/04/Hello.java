public class Hello{
	
	
	// 三元运算符
	public static void main(String[] args){
		
		//  exp?exp1:exp2;   exp = true => exp1   exp = false => exp2   
		// exp = 表达式 | 值 运算结果必须是boolean
		
		int score = 0;
		
		// 可以嵌套使用
		String res = score>=60?"及格":(score>0?"不及格":"喊家长");
		
		System.out.println(res);
		
	}
	
}













