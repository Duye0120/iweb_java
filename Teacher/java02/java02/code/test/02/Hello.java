import java.util.Scanner;

/**
	输出9*9口诀。 
	1*1=1
	1*2=2 2*2=4
*/
public class Hello{
	
	public static void main(String[] args){
		
		int x = 1;
		for(;x <= 9;x++){
			for(int y = 1;y <= x;y++){
				System.out.printf("%d * %d = %d \t",x,y,x*y);
			}
			System.out.printf("\n");
		}
		
	}
	
}