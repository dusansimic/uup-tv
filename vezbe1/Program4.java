class Program4 {
  public static void main(String[] args) {
    int x = Svetovid.in.readInt("Unesite x: ");
    
    System.out.print("f(x) = ");
    if (x < 0) {
      System.out.println(Math.pow(x, 2));
    } else if (x > 0) {
      System.out.println(Math.log(x));
    } else {
      System.out.println(42);
    }
  }
}