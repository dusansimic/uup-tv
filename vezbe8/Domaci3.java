class Domaci3 {
  public static void main(String[] args) {
    int n, m;
    do
      m = Svetovid.in.readInt("Unesite broj redova: ");
    while (m <= 2 || m > 15);   
    
    do
      n = Svetovid.in.readInt("Unesite broj kolona: ");
    while (n <= 2 || n > 15);
    
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if ((i & 1) == 0)
          System.out.print("0 ");
        else 
          System.out.print("1 ");
      }
      System.out.println();
    }   
    
  }

}