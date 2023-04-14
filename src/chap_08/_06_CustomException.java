package chap_08;

public class _06_CustomException {
    public static void main(String[] args) {
        //사용자 정의 예외
        int age =17;
        try{
            if(age<19){
                throw new AgeLessThan19("만19세 ㄴㄴ");
            }else{
                System.out.println("주문한 상품 나옴 ㅎ");
            }
        }catch (AgeLessThan19 e){
            System.out.println("어린노무자식이..");
        } catch (Exception e){
            System.out.println("모든 예외 처리");
        }
    }
}

class AgeLessThan19 extends Exception{
    public AgeLessThan19(String message) {
        super(message);
    }
}