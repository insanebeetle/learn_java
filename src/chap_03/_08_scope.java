package chap_03;

public class _08_scope {

        public static void code(String info, int index ) {
            String codedInfo = info.substring(0,index);
            //for(int i = index; i < info.length() - a; i++)
           for (int i = 0; i < info.length() - index; i++) {
                codedInfo += "*";
            }
            System.out.println(codedInfo);
        /* info[0]은 2번째 부터 **
           info[1]은 8번째 **
           info[3]는 8번째부터 **

            String[] codingInfo = new String[3];
            for (int i = 0; i < 3; i++) {
                if (i == 0) {
                    for (int j = 1; j < info[i].length(); j++) {
                        codingInfo[i] = info[i].replace(, "*");
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
        String[] customer = new String[]{"나코딩", "910417-1192222", "010-1234-1234"};
        code("나코딩", 1);
        code("910417-1192222", 8);
        code("010-1234-1231", 9);
    }
}
