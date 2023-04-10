package quiz07;

import quiz07.Camera.Camera;
import quiz07.Camera.FactoryCam;
import quiz07.Camera.SpeedCam;
import quiz07.detector.AdvanccedFireDetector;
import quiz07.detector.Detectable;
import quiz07.detector.FireDetector;
import quiz07.reporter.NormalRipoter;
import quiz07.reporter.Ripotable;
import quiz07.reporter.VideoRiporter;

public class _01_Abstract {
    public static void main(String[] args) {
        //데이터 추상화
        //추상 클래스 , 추상메소드
        Camera c1 = new SpeedCam();
        Camera c2 = new FactoryCam();
        c1.showMainFeature();
        c2.showMainFeature();
        System.out.println("---------------");
        //인터페이스 interface
        //뼈대만 제공하는 클래스 + 다중상속
        Ripotable nomal = new NormalRipoter();
        nomal.report();

        Ripotable video = new VideoRiporter();
        video.report();
        System.out.println("---------------");

        Detectable d1 = new FireDetector();
        Detectable d2 = new AdvanccedFireDetector();
        d1.detect();
        d2.detect();

        System.out.println("---------------");
        FactoryCam f1 = new FactoryCam();
        f1.setD1(d2);
        f1.setR1(video);
        //객체 생성하고 기존에 만들어진 report, dectet의 인스턴스객체를
        //집어넣기

        f1.detect();
        f1.report();
    }
}
