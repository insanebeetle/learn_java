package quiz07.detector;

public class AccidentDetect implements Detectable{
    @Override
    public void detect() {
        System.out.println("사고를 감지했습니다.");
    }
}
