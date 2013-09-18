// var. 2001
public class Lab2 {
  public static void main(String[] args) {
  E a = new E();
  E b = new B();
  B c = new B();
  c.p17();
  b.p6();
  c.p27();
  a.p26();
  a.p23();
  b.p19();
  a.p12();
  b.p39();
  a.p13();
  b.p2();
  c.p11(a);
  c.p11(b);
  c.p11(c);
  }
}
class E {
  int p30;
  int p22;
  int p25;
  int p37;
  int p36;
  long p34;
  long p38;
  long p15;
  int[] p1 = {0, 2, 0, -1, 1};
  int[] p40 = {1, -1, -2, -3};
  int[] p8 = {-1, 3, 1, 1};
  static int p35;
  static int p10;
  static int p4;
  static int p18;
  static int p28;
  public E() {
    p30 = 0;
    p22 = 8;
    p25 = 2;
    p37 = 4;
    p36 = 3;
    p34 = 1L;
    p38 = 9L;
    p15 = 7L;
  }
  public void p17() {
    System.out.println("метод p17 в классе E");
    System.out.println(p8[1] + p8[1]);
  }
  public void p6() {
    System.out.println("метод p6 в классе E");
    System.out.println(p36 << 2);
  }
  public void p27() {
    System.out.println("метод p27 в классе E");
    System.out.println(p37);
  }
  public void p26() {
    System.out.println("метод p26 в классе E");
    System.out.println(--p18);
  }
  public void p23() {
    System.out.println("метод p23 в классе E");
    System.out.println(p8[1]);
  }
  public void p19() {
    System.out.println("метод p19 в классе E");
    System.out.println(p35++);
  }
  public static void p12() {
    System.out.println("метод p12 в классе E");
    System.out.println(p18);
  }
  public static void p39() {
    System.out.println("метод p39 в классе E");
    System.out.println((p18 + 2));
  }
  public static void p13() {
    System.out.println("метод p13 в классе E");
    System.out.println(p28);
  }
  public static void p2() {
    System.out.println("метод p2 в классе E");
    System.out.println((p28 + 4));
  }
  public void p11(E r) {
    r.p17();
  }
  public void p11(B r) {
    r.p6();
  }
}
class B extends E {
  public B() {
    p30 = 1;
    p22 = 4;
    p36 = 0;
    p34 = 3L;
    p38 = 6L;
  }
  public void p26() {
    System.out.println("метод p26 в классе B");
    System.out.println(p8[1] - p8[1]);
  }
  public void p23() {
    System.out.println("метод p23 в классе B");
    System.out.println(p30);
  }
  public static void p12() {
    System.out.println("метод p12 в классе B");
    System.out.println(p35);
  }
  public static void p39() {
    System.out.println("метод p39 в классе B");
    System.out.println((p35 + 3));
  }
  public static void p13() {
    System.out.println("метод p13 в классе B");
    System.out.println(p35--);
  }
  public static void p2() {
    System.out.println("метод p2 в классе B");
    System.out.println(p10);
  }
  public void p11(E r) {
    r.p27();
  }
  public void p11(B r) {
    r.p26();
  }
}
