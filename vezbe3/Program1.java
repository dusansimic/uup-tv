class Program1 {
  public static void main(String[] args) {
    char c;
    do {
      c = Svetovid.in.readChar("Unesite karakter: ");
      
      if (c >= 'A' && c <= 'Z') {
        System.out.println((char) (c + 'a' - 'A'));
      } else {
        System.out.println(c);
      }
    } while (c != '.');
  }
}