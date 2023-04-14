package chap_08;

public class _01_TryCatch {
    public static void main(String[] args) {
        //예외처리
        //오류 = 컴파일 오류 ,런타임 오류(에러, 예외)
        //런타임 오류는 파일이 끝까지 실행되지 않고 종료됨
        //에러 - 메모리 부족등 코드로 해결할수 없는것
        //예외 - 코드로 해결할 수 있음

        try{
            //System.out.println( 3/0);
//            int arr[] = new int[3];
//            arr[5] = 100;

//            Object obj = "test";
//            System.out.println((int) obj);
            //형 변환 실패
        }
        catch (Exception e){
            System.out.println("에러 발생" + e.getMessage());
            e.printStackTrace(); //에러 발생 내용
        }

        System.out.println("프로그램 종료");
    }
}

//class s{
//    public void methodA(){
//        this.methodA();
//    }
//} 스택오버플로우 에러 발생!