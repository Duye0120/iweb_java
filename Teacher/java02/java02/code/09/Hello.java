public class Hello{
	
	public static void main(String[] args){
		// 数组是一个引用数据类型
		// 声明数组：2种方式
		// int[] arr; // 类型是int 推荐使用这种方式
		// int arr[]; 
		int[] arr; // 局部变量, 数组的引用
		
		// 数据初始化： 申请堆内存空间
		arr = new int[4]; // 长度4 数组中可以存储 4 个 int 类型的数据
		
		// 对应的元素为对应类型的缺省值
		// 通过下标获取数据对应位置的值
		System.out.println(arr[0]);
		
		/*
		每种类型对用的缺省值：
		整数类型(byte short int long) ： 0
		浮点(float double)： 0.0
		boolean: false
		char: '\u0000'
		引用数据类型： null (关键字)
		*/
		
		double[] ds = new double[4];
		System.out.println(ds[0]);
		
		String[] strs = new String[4];
		System.out.println(strs[0]);
		
		// 初始化方式：
		// 1. 动态初始化： new 关键字来进行初始化,初始化的时候给定数组的长度, new 的作用就是申请堆内存空间。
		
		int[] arr1 = new int[4];
		arr1[0] = 10;
		arr1[1] = 8;
		arr1[2] = 9;
		arr1[3] = 20;
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		
		// 2. 静态初始化： 为了更加方便的编写代码, 必须是声明的同时进行初始化
		int[] arr2 = {10,20,30}; // 长度为3
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		// 数组的长度
		System.out.println(arr2.length); // 属性
		
		// 数据越界异常
		System.out.println(arr2[3]); // ArrayIndexOutOfBoundsException: 3
		
	}
	
}










