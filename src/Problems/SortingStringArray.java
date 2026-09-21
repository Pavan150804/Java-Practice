package Problems;

import java.util.Arrays;

public class SortingStringArray {
  public static void main(String[] args) {
	  String st[] = {"floor","flat","flex","flight","flower"};

      for (int i = 0; i < st.length - 1; i++) {
          for (int j = 0; j < st.length - 1 - i; j++) {

              if (st[j].length() > st[j + 1].length()) {
                  String temp = st[j];
                  st[j] = st[j + 1];
                  st[j + 1] = temp;
              }
          }
      }

      System.out.println(Arrays.toString(st));
}
}
