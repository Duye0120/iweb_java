public class Hello{
	
	public static void main(String[] args){
		// 数组的遍历： 1 循环 2 增强for
		
		int[] arr = {37,12,98,37,12,93,81};
		// 循环  i 表示数组的索引 下标
		for(int i = 0;i < arr.length;i++){
			// System.out.println(arr[i]); // 通过下标
			
			// 可以通过下标改变元素的值
			arr[i] = arr[i] * 2;
		}
		
		System.out.println("----------------------");
		
		for(int e:arr){
			System.out.println(e); // 只能遍历 不能进行元素值的改变
		}
	}
	
}










