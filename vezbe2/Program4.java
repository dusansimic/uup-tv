class Program4 {
  public static void main(String[] args) {
    int broj = Svetovid.in.readInt("Unesite broj: ");
    
    while (broj != 0) {
      System.out.print(broj % 10);
      broj /= 10;
    }
    System.out.println();
  }
}