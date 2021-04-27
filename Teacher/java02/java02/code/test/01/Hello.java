import java.util.Scanner;

/**
	* 
	*** 
	****** 
	******** 
	****** 
	*** 
	* 
*/
public class Hello{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行数：");
		int r = sc.nextInt();
		
		// 判断r的合法性
		if(r<3||r%2!=1){
			System.out.println("输入的整数必须是大于等于3的奇数!");
			return;
		}
		
		int m = (r+1)/2; // 中心点
		
		// 画图
		for(int i = 1;i<=r;i++){
			
			if(i==1||i==r){
				System.out.println("*");
			}
			
			if(i==2||i==r-1){
				for(int j=1;j<=3;j++){
					System.out.print("*");
				}
				System.out.print("\n");
			}
			
			if(i>=3&&i<=m){
				for(int j=1;j<=2*i;j++){
					System.out.print("*");
				}
				System.out.print("\n");
			}
			
			if(i>m&&i<r-1){
				for(int j=1;j<=2*(m-(i-m));j++){
					System.out.print("*");
				}
				System.out.print("\n");
			}
			
		}
		
	}
	
}