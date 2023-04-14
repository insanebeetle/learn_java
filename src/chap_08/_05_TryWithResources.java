package chap_08;

public class _05_TryWithResources {
    public static void main(String[] args) {
        MyFileWriter writer1 = null;
        try{
            writer1 =new MyFileWriter();
            writer1.write("아이스크림 먹을래");
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } //예외처리 구문 안에 또다른 예외처리를 넣을수 잇음

        System.out.println("----------------");

        try(MyFileWriter writer2 = new MyFileWriter()){
            writer2.write("빵 먹을래요");
        }catch (Exception e){
            e.printStackTrace();
        }
        //위 코드를 보면 try에서 객체를 생성함으로써 close()메소드까지 실행됨
        //이게 가능한 이유는 MyFileWriter클래스가 AutoCloseable을 상속했기때문


    }
}

class MyFileWriter implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("파일을 닫습니다.");
    }
    public void write(String line){
        System.out.println("파일의 내용을 입력");
        System.out.println("입력 내용 : " + line);
    }
}