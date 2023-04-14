package chap_08;

public class _04_Finally {
    public static void main(String[] args) {
        try{
            System.out.println("택시 문 열기");
            throw new Exception("휴무택시");
        }catch (Exception e){
            System.out.println("문제 : " + e.getMessage());
        }finally{
            System.out.println("택시의 문을 닫는다");
        }
        //finally는 에러가 발생하든 말든 무조건 실행되어야 하는 구문
        //try + catch + finally
        //try + finally

        System.out.println("--------------");
        try{
            System.out.println(3/0);
        }finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
