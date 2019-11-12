class Program2 {
  public static void main(String[] args) {
    int a;
    do {
      a = Svetovid.in.readInt("Unesite broj a: ");
    } while (a <= 1);
    int b;
    do {
      b = Svetovid.in.readInt("Unesite broj b: ");
    } while (b <= 1 || b >=a);
    
    int n;
    for (n = 0; Math.pow(b, n) < a; n++);
    n--;
    System.out.println(n);
  }
}