class Program1 {
  public static void main(String[] args) {
    char znak;
    do {
      znak = Svetovid.in.readChar("Unesite znak (s, c, a, l, e): ");
    } while (znak != 's' && znak != 'c' && znak != 'a' && znak != 'l' && znak != 'e');
    double x = Svetovid.in.readDouble("Unesite x: ");
    
    double rez;
    switch (znak) {
      case 's':
        rez = Math.sin(x);
        break;
      case 'c':
        rez = Math.cos(x);
        break;
      case 'a':
        rez = Math.atan(x);
        break;
      case 'l':
        rez = Math.log(x);
        break;
      case 'e':
        rez = Math.exp(x);
        break;
      default:
        rez =  0.0;
    }
    System.out.println(rez);
  }
}