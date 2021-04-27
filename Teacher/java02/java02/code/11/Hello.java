public class Hello{
	
	// 多维数组： 二维数组
	public static void main(String[] args){
		
		
		/*
		// 动态初始化
		int[][] arr ;
		
		arr = new int[5][]; // 数组中的每个元素都是一个数组
		
		System.out.println(arr.length);
		
		// 元素的默认值
		System.out.println(arr[0]); // null
		
		// 对数组元素进行初始化
		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[5];
		
		System.out.println(arr[0][0]); // 0
		arr[0][1] = 10;
		
		// 遍历二维数组
		
		for(int i =0;i<arr.length;i++){
			
			for(int j = 0;j < arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
		*/
		
		// 
		int[][] arr = {
			{2,3,4,5},
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
		for(int i =0;i<arr.length;i++){
			
			for(int j = 0;j < arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	
}










