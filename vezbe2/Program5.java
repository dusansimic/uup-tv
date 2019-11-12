class Program5 {
  public static void main(String[] args) {
    int parnih = 0, neparnih = 0;
    int n;
    do {
      do {
        n = Svetovid.in.readInt("Unesite prirodan broj: ");
      } while (n < 0);
      if (n % 2 == 0 && n != 0) {
        parnih++;
      } else if (n % 2 == 1) {
        neparnih++;
      }
    } while (n != 0);
    System.out.println("Uneto je " + parnih + " parnih i " + neparnih + " neparnih brojeva.");
  }
}