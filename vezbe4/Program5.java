class Program5 {
  public static void main(String[] args) {
    int i = 2;
    boolean jednak = false;
    while (!jednak) {
      int zbir = 0;
      int tmp = i;
      while (tmp > 0) {
        zbir += Math.pow(tmp % 10, 4);
        tmp /= 10;
      }
      jednak = i++ == zbir;
    }
    System.out.println(i);
  }
}