public class Test {
  public Test();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: new           #2                  // class java/lang/Integer
       3: dup
       4: bipush        100
       6: invokespecial #3                  // Method java/lang/Integer."<init>":(I)V
       9: astore_1
      10: new           #2                  // class java/lang/Integer
      13: dup
      14: bipush        100
      16: invokespecial #3                  // Method java/lang/Integer."<init>":(I)V
      19: astore_2
      20: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
      23: aload_1
      24: aload_2
      25: if_acmpne     32
      28: iconst_1
      29: goto          33
      32: iconst_0
      33: invokevirtual #5                  // Method java/io/PrintStream.println:(Z)V
      36: sipush        200
      39: invokestatic  #6                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      42: astore_3
      43: sipush        200
      46: invokestatic  #6                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      49: astore        4
      51: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
      54: aload_3
      55: aload         4
      57: if_acmpne     64
      60: iconst_1
      61: goto          65
      64: iconst_0
      65: invokevirtual #5                  // Method java/io/PrintStream.println:(Z)V
      68: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
      71: aload_3
      72: aload_1
      73: if_acmpne     80
      76: iconst_1
      77: goto          81
      80: iconst_0
      81: invokevirtual #5                  // Method java/io/PrintStream.println:(Z)V
      84: return
}