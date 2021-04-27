import java.util.Scanner; // 引入Scanner的地址

public class Hello{
	
	
	// 分支
	public static void main(String[] args){
		
		
		/*
		
		if(condition){
			
			// TO DO : true
			
		}else if(condition){
			// TO DO : true
		}....
		else{
			// 其他所有 不满足上面的任何一个条件
		}
		
		// 以上的编程模型 可以从if开始自由组合
		
		//1.
		if(condition){}
		
		//2. 
		if(condition){}else{}
		
		*/
		
		// 通过成绩来判断等级：
		// >90  A
		//  ++>80  B
		// >60  C
		//      D
		
		// 接收控制台输入的值：
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		System.out.println("成绩："+score);
		
		/*
		if(score>90){
			System.out.println("成绩：A");
		}else if(score>80){
			System.out.println("成绩：B");
		}else if(score>60){
			System.out.println("成绩：C");
		}else{
			System.out.println("成绩：D");
		}
		*/
		
		// System.out.println("continue...");
		
		// 2.如果可以使用多个if来实现业务 尽量使用多个if
		// 5分制   5->A 4->B 3->C 
		
		/*
		if(score == 5){
			System.out.println("成绩：A");
			return; // 终止当前函数
		}
		
		if(score == 4){
			System.out.println("成绩：B");
			return; 
		}
		
		if(score == 3){
			System.out.println("成绩：C");
			return; 
		}
		
		System.out.println("成绩：D");
		*/
		
		
		
		// OVER
		
		
		// 3.分支的嵌套  分数应该是在 0-100
		
		
		// 数据合法性验证
		
		/*
		if(score>=0&&score<=100){
			// 业务判断
			if(score>90){
				System.out.println("成绩：A");
			}else if(score>80){
				System.out.println("成绩：B");
			}else if(score>60){
				System.out.println("成绩：C");
			}else{
				System.out.println("成绩：D");
			}
		}else{
			System.out.println("成绩：不合法");
		}
		*/
		
		// 优化嵌套: 能不适用嵌套尽量不要使用
		
		if(score<0||score>100){
			System.out.println("成绩：不合法");
			return;  // System.exit(1);
		}
		
		// 业务判断
		if(score>90){
			System.out.println("成绩：A");
		}else if(score>80){
			System.out.println("成绩：B");
		}else if(score>60){
			System.out.println("成绩：C");
		}else{
			System.out.println("成绩：D");
		}
	}
	
}













