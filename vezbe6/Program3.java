class Program3 {
  public static void main(String[] args) {
    String broj = Svetovid.in.readLine("Unesite broj: ");
    int brojInt = 0;
    boolean greska = false;
    for (int i = 0; i < broj.length() && !greska; i++) {
      char c = broj.charAt(i);
      if (c >= '0' && c <= '9') {
        brojInt *= 10;
        brojInt += c - '0';
      } else {
        greska = true;
        System.out.println("GRESKAAAAAAAAAAAAA");
      }
    }
    if (!greska) {
      System.out.println(brojInt);
    }
  }
}