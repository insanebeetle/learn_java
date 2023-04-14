package chap_08;

public class _08_quiz {
    public static void main(String[] args) {
       int errorCode = 2;
       try{
            if(errorCode == 0){
                System.out.println("판매완료");
            }else if(errorCode ==1 ){
                throw new error1("판매시간 외");
            }else {
                throw new error2("품절");
            }
       }catch (error1 e){
           System.out.println(e.getMessage());
           System.out.println("상품구매는 20시부터");

       }catch (error2 e){
           System.out.println(e.getMessage());
           System.out.println("물건이 없어요~ 니가 어쩔건데~");
       }
    }
}

class error1 extends Exception{
    public error1(String message) {
        super(message);
    }
}
class error2 extends Exception{
    public error2(String message) {
        super(message);
    }
}