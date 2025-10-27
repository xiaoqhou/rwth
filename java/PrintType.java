public class PrintType {
  public static void main(String[] args) {
    int intMax = 2147483647;

    System.out.println( intMax + 1);
    System.out.println(true ? 2147483647+1: 0L);
    System.out.println((true ? 2147483647 : 0L) +1);
    System.out.println((true ? 2147483647 : 0) +1);
    System.out.println(printIntBinary(intMax));
    System.out.println(printIntBinary(Integer.MIN_VALUE));

  }

  public static String printIntBinary(int i) {
    String binStr = String.format("%32s", Integer.toBinaryString(i));
    return binStr.replaceAll(" ", "0");
  }
}
