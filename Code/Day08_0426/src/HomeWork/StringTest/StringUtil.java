package HomeWork.StringTest;

public class StringUtil {
    public static void main(String[] args) {
        // 字符串的拼接 concat
        System.out.println("Hello".concat("World!"));// HelloWorld!
        // 求字符串的长度 length
        // public int length() : 返回int类型,指的是字符串中Unicode的数目
        System.out.println("Hello".length());// 5
        // 3. 求字符串中某一位置的字符 charAt
        // 索引值的起始位置为0,最后一个字符的位置是length() - 1
        System.out.println("Hello".charAt(0));// H
        // 4. 字符串的比较
        // 1) public int compareTo(String anotherString)
        System.out.println("Hello".compareTo("Hello"));//0
        // 2) public boolean equals(String anotherString)
        System.out.println("Hello".equals("Hello"));// true
        // 5. 从字符串中提取字符串
        // 1) public String subString(int beginIndex)
        // 从beginIndex位置,从当前字符传中去除剩余的的字符作为一个新的字符串返回
        System.out.println("hello".substring(1));//ello
        // 2) public String subString(int beginIndex,int endIndex)
        System.out.println("hello".substring(1,3));//el
        // 6. 判断字符串的前缀和后缀
        // 判断字符的前缀是否为指定的字符串
        // 1) public boolean startsWith(String prefix)
        System.out.println("Hello".startsWith("He"));// true
        System.out.println("Hello".startsWith("el"));// false
        // 2) public boolean StartsWith(String prefix,int toffset);
        System.out.println("Hello".startsWith("He",0));// true
        System.out.println("Hello".startsWith("He",1));// false
        // 3) public boolean endWith(String suffix)
        System.out.println("hello".endsWith("lo"));// true
        // 7.字符串中单个字符的查找
        // 1)public  int indexOf(String ch)
        System.out.println("hello".indexOf('h'));// 0
        System.out.println("hello".indexOf('H'));// -1
        System.out.println("hello".indexOf('l'));// 2
        // 2) public int indexOf(String ch,int fromIndex)
        System.out.println("hello".indexOf("he",0));// 0
        System.out.println("hello".indexOf("he",1));// -1
        // 3) public int lastIndexOf(String ch)
        System.out.println("hello".lastIndexOf("H"));// 0
        System.out.println("hello".lastIndexOf("h"));// -1
        // 4)public int lastIndexOf(String ch,fromIndex)
        System.out.println("hello".lastIndexOf('h',1));//0
        // 8. 字符串中子串的茶渣
        // 字符串中子串的查找与字符串中单个字符的查找十分相似
        // 1) public int indexOf(String str)
        System.out.println("hello".indexOf("hello"));//0
        System.out.println("hello nice".indexOf("nice"));// 6
        System.out.println("hello".indexOf("He"));// 没有找到则返回-1
        // 2) public int indexOf(String str,int fromIndex)
        System.out.println("hello".indexOf("he",0));//0
        System.out.println("hello".indexOf("he",1));//-1
        // 3) public int lastIndex(String str)
        System.out.println("hello".lastIndexOf("he"));//0
        System.out.println("hello".lastIndexOf("el"));//1
        // 4) public int lastIndex(String str, int fromIndex)
        System.out.println("hello".lastIndexOf("he",0));//0
        System.out.println("hello".lastIndexOf("lo",2));//-1
        // 9. 字符串中字符大小写转换
        // 1) public String toLowerCase()
        // 2) public String toUpperCase()
        System.out.println("hello".toUpperCase());//HELLO
        System.out.println("HELLO".toLowerCase());//hello
        // 10 字符串中多余空格的去除
        // public String trim()
        System.out.println("hello  ".trim());//hello
        // 11 字符串中字符的替换
        // 1) public String replace(char old,char newChar)
        System.out.println("hello".replace('l','L'));//hello
        System.out.println("h e l l o".replace(" ",""));// hello
        // 2) public String replaceFirst()
        // 3) public string replaceAll()

    }
}
