class Program6 {
  public static void main(String[] args) {
    char c;
    int slova = 0, cifara = 0, ostali = 0;
    do {
      c = Svetovid.in.readChar("Unesite karakter: ");
      if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
        slova++;
      } else if (c >= '0' && c <= '9') {
        cifara++;
      } else {
        ostali++;
      }
    } while (c != '.');
    System.out.println("Br slova: " + slova);
    System.out.println("Br cifara: " + cifara);
    System.out.println("Br ostalih: " + ostali);
  }
}