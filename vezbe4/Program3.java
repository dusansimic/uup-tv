// Ovaj zadatak nije resen kao sto je predvidjeno (preko switch-a) ali je kul
// fazon koji bi bilo dobro skontati i zapamtiti.

class Program3 {
  public static void main(String[] args) {
    int[] slova = new int[127];
    char c;
    do {
      c = Svetovid.in.readChar("Unesite karakter: ");
      slova[c]++;
    } while (c != '.');
    
    if ((slova['B'] + slova['b'] >= 1) && (slova['N'] + slova['n'] >= 2) && (slova['A'] + slova['a'] >= 3)) {
      System.out.println("Moze se napisati rec banana.");
    } else {
      System.out.println("Ne moze se napisati rec banana.");
    }
  }
}