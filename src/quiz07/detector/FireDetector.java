package quiz07.detector;

public class FireDetector implements Detectable{
    @Override
    public void detect() {
        System.out.println("일반 성능 화재감지");
    }
}
