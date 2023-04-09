package chap_05;

public class _02_AccessModifier {
    public static void main(String[] args) {
        //private : 해당 클래스 내에서만 접근 가능
        //public : 모든 클래스에서 접근 가능
        //default : 아무것도 안 적을때 적용 같은 패키지내 접근가능
        //protected : 같은 패키지내에서 가능, 다른 패키지인경우 자식클래스는 가능
        //crtl R 로 전체변수 변경가능
        BlackBox2 b1 = new BlackBox2();
        

        BlackBox2 b2 = new BlackBox2();
    }
}
