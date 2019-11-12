class Program4 {
  public static void main(String[] args) {
    String upis = Svetovid.in.readLine("Unesite nesto: ");
    int p;
    do {
      p = Svetovid.in.readInt("Unesite broj odakle kopirati: ");
    } while (p <= 0 || p > upis.length());
    int n;
    do {
      n = Svetovid.in.readInt("Unesite koliko kopirati: ");
    } while (n <= 0 || (p + n) > upis.length());
    
    String novi = "";
    for (int i = p; i < p + n; i++) {
      novi += upis.charAt(i);
    }
    System.out.println(novi);
  }
}