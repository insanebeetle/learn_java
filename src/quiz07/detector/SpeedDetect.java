package quiz07.detector;

public class SpeedDetect implements Detectable{
    @Override
    public void detect() {
        System.out.println("과속을 감지합니다");
    }
}
