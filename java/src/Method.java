public class Method {

  /* 
   * 定义一个方法使用： 返回值 方法名（输入变量...）{
   * }
   * 在方法中可以使用return返回方法的结果，如果方法没有返回值使用void定义返回值
   * 比如，下面定义一个add方法把两个数相加
   */
  public static int add(int x, int y){
    return x+y;
  }

  // 另外一个方法打印消息
  public static void printHello(String message){
    System.out.println("Hello, "+ message);
  }

  public static void main(String[] args){
    System.out.println("add method: "+ add(1,2));
    printHello("yichen");
  }

  // 定义栈的两个方法
  // push char c to a array myArray
  public static boolean pushTo(char[] myArray, char c){
    
    return true;
  }

  // pop char c from myArray
  public static char popUp(char[] myArray) {
    char c = ' ';

    return c;
  }

}
