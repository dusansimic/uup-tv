class Program2 {
  public static void main(String[] args) {
    int r;
    do {
      r = Svetovid.in.readInt("Unesite poluprecnik kruga: ");
    } while (r <= 0);
    System.out.println("O = " + (2 * r * Math.PI));
    System.out.println("P = " + (Math.pow(r, 2) * Math.PI));
  }
}