package chap_08;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
        try {
            writeFile();
        } catch (IOException e) {
            System.out.println("메인 메소드에서 실행");
        }
    }

    public static void writeFile() throws IOException {
        //위의 throw상속?을 사용하면 에러를 원인제공자?에게 넘겨줌
        //위 구문이 없다면 아래 주석문처럼 메소드 내에서 처리하게됨
//        try {
//            FileWriter writer = new FileWriter("text.txt");
//            throw new IOException("파일 쓰기 실패");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("라이트파일 메소드 내 자체 해결");
//        }

        FileWriter writer = new FileWriter("text.txt");
        throw new IOException("파일 쓰기 실패");
    }
}
