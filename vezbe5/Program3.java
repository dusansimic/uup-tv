class Program3 {
  public static void main(String[] args) {
    int[] cifre = new int[10];
    int ostali = 0;
    String broj = Svetovid.in.readLine("Unesite nesto: ");
    
    for (int i = 0; i < broj.length(); i++) {
      char c = broj.charAt(i);
      if (c >= '0' && c <= '9') {
        cifre[c - '0']++;
      } else {
        ostali++;
      }
    }
    
    for (int i = 0; i < 10; i++) {
      System.out.println((char) (i + '0') + " -> " + cifre[i]);
    }
    System.out.println("Ostale -> " + ostali);
  }
}