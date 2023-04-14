package chap_08;

public class _02_Catch {
    public static void main(String[] args) {
        try{
            //System.out.println( 3/0);
//            int arr[] = new int[3];
//            arr[5] = 100;

//          Object obj = "test";
//         System.out.println((int) obj);
        }
        //특정 에러에 대한 캐치구문들
        //다른 종류의 예외처리에 대해 같은 결과 처리방법
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("계산이 잘못됨");
        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("배열 인덱스 에러");
//        }
        catch (ClassCastException e){
            System.out.println("클래스 형변환에러");
        }
        //Exception은 모든 예외처리의 부모객체 like
        catch (Exception e){
            System.out.println("에러 발생" + e.getMessage());
            e.printStackTrace(); //에러 발생 내용
        }

        System.out.println("프로그램 종료");
    }
}
