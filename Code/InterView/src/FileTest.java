import java.io.File;

public class FileTest {
    private static int count = 0;

    public static void main(String[] args) {
        // 统计文件个数
        File file = new File("D:\\A_java");
        f1(file);
        System.out.println("文件个数" + count);
    }

    private static void f1(File file) {
        if (file.exists()) {
            File[] listFiles = file.listFiles();
        } else {
            System.out.println("抱歉文件不存在");
        }
    }


    /*
    if (f.exists()) {
			File[] listFiles = f.listFiles();
			for(File ff : listFiles) {
				if (ff.isDirectory()) {
					f1(ff);
					System.out.println("目录:" + ff.getAbsolutePath());
				} else {
					count++;
					System.out.println("文件:" + ff.getAbsolutePath());
				}
			}
		} else {
			System.out.println("抱歉，文件不存在!");
		}
     */
}
