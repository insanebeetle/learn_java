package chap_03;

public class _08_scope {

        public static void code(String str, int a){

        /* info[0]은 2번째 부터 **
           info[1]은 8번째 **
           info[3]는 8번째부터 **

        String[] codingInfo = new String[3];
            for (int i = 0; i < 3; i++) {
                if(i == 0){
                    for (int j = 0; j < info[0].length(); j++) {
                        codingInfo[i] = info[i].replace(String.valueOf(info[i].charAt(j)), "*");
                    }
                    System.out.println(codingInfo[i]);
                }
            }*/

        };

    public static void main(String[] args) {
        for (String s:args
             ) {
            System.out.println(s);
        }//모든 배열값을 받을땐 foreach문법 사용

        //퀴즈
        String[] customer = new String[]{"나코딩", "910417-1192222", "010-1234-12314"};


    }
}
