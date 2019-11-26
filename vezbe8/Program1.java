class Program1 {
  static String dajCifru(int broj) {
    if (broj == 0) {
      return "";
    }
    
    return Integer.toString(broj % 10) + " " + dajCifru(broj / 10);
  }
  
  public static void main(String[] args) {
    int broj = Svetovid.in.readInt("Unesite broj: ");
    
    System.out.println(dajCifru(broj));
  }
}