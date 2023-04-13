package chap_07.converter;

@FunctionalInterface
//이 인터페이스는 함수형 인터페이스임을 선언함
//따라서 메소드를 2개 이상 가지지 못하도록 설정됨
public interface Convertible {
    void convert(int usd);
}
