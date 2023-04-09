package chap_05;

import chap_05.Camera.Camera;
import chap_05.Camera.speedcam;

public class _04_inheritance {
    public static void main(String[] args) {
        Camera c1 =new Camera();
        speedcam c2 =new speedcam();

        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.checkSpeed();
        c2.takePicture();

        //다형성
        Camera c3 =new Camera();
        Camera c4 =new speedcam();
        //이렇게도 객체생성가능하지만 자식클래스의 메소드사용X
        if(c4 instanceof speedcam) {
            ((speedcam) c4).checkSpeed();
            //이런식으로 형변환을 시켜줘야함
        }

        c2.takePicture();

        //call by value // reference of value;
        /*콜바이는 그 메모리 자체에 접근해 변경
        레퍼런스 바이는 참조하는 주소값을 변수에 담기때문에 대입하면 연계?가 되버림
        * */

    }
}
