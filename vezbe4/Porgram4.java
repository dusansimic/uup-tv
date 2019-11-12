// Ovo je pisano bez optimizacije uz pomoc labele. Kod koji je na slajdovima
// ne prati pravila citkog koda o kom su nam asistenti predavali i smatram da
// u najmanju ruku to treba ispraviti. Za one koji ne razumeju, mislim na if
// bez zagrada o kom su toliko penili.
class Porgram4 {
  public static void main(String[] args) {
    for (int i = 1; i <= 10000; i++) {
      int zbir = 0;
      int tmp = i;
      while (tmp > 0) {
        zbir += Math.pow(tmp % 10, 3);
        tmp /= 10;
      }
      if (zbir == i) {
        System.out.println(i);
      }
    }
  }
}