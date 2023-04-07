package chap_03;

public class _06_multiArray {
    public static void main(String[] args) {
        String[][] seats = new String[][] {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };
        System.out.println(seats[1][2]);
        //없는 배열은 에러

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        String[][] seats2 = new String[10][15];
        //String[] eng = {"a", "b","c","d","e","f","g","h","i","j"};
        char ch = 'A';
        for (int i = 0; i <seats2.length ; i++) {
            for (int j = 0; j < seats2[i].length ; j++) {
                seats2[i][j] = String.valueOf(ch) + (j+1);
            }
            ch++;
        }
        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }

        char c = 'a';
        System.out.println(c +""+ (int)c);
        int a = 66;
        System.out.println((char)a);


        int[] size = new int[10];
        int s_size = 250;
        for (int i = 0; i <size.length; i++) {
          size[i] = s_size;

          s_size += 5;
        }
        for (int i = 0; i <size.length; i++) {

            System.out.print(size[i]+ " ");
            if(size[i]==275){
                System.out.println("재고없음");
            }
        }
    }
}
