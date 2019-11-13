class Program2 {
  public static void main(String[] args) {
    int br;
    do {
      br = Svetovid.in.readInt("Unesite prirodan broj: ");
    } while (br <= 0);
    
    int suma = 0;
    while (br > 0) {
      suma += br % 10;
      br /= 10;
    }
    
    System.out.println(suma);
  }
}