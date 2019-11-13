class Program2 {
  public static void main(String[] args) {
    int broj = Svetovid.in.readInt("Unesite broj: ");
    int m;
    do {
      m = Svetovid.in.readInt("Unesite bazu: ");
    } while (m <= 0 || m >= 10);
    
    String broj1 = "";
    while (broj > 0) {
      broj1 = broj % m + broj1;
      broj /= m;
    }
    System.out.println(broj1);
  }
}