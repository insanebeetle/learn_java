package chap_08;

public class _03_Throw {
    public static void main(String[] args) {
        int age =17;
        try{
            if(age<19){
                throw new Exception("만19세 ㄴㄴ");
            }else{
                System.out.println("주문한 상품 나옴 ㅎ");
            }
            //의도적으로 에러를 발생throw해서 catch에서 받아서 해결
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
