package chap_04;

import chap_05.*;

public class _01_array {
    public static void main(String[] args) {

        //String[] orders = new String[4];
        //String orders[] new String[4];
        //String[] orders = new String[]{"유유","유유","유유","유유"};
        String[] orders = {"유유","유유","유유","유유"};

        for(int i=0; i<orders.length;i++){
            System.out.println(orders[i]);
        }
        //위랑 같은 코드 좀 더 간결하게 사용가능  for each
        for (String order : orders ){
            System.out.println(order);
        }


    }
}
