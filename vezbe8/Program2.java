class Program2 {
  static int zbir(int broj) {
    if (broj < 10) {
      return broj;
    }
    return (broj % 10) + zbir(broj / 10);
  }
  
  public static void main(String[] args) {
    int broj = Svetovid.in.readInt("Unesite broj: ");
    
    System.out.println(zbir(broj));
  }
}