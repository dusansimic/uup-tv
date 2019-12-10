class Program1 {
  static int trazi(int n) {
    if (n == 1) {
      return 2;
    } else if (n == 2) {
      return 3;
    } else {
      return trazi(n - 1) + trazi(n - 2);
    }
  }
  
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite duzinu lanca: ");
    } while (n <= 0);
    
    System.out.println(trazi(n));
  }
}