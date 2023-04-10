package quiz07.Camera;

import quiz07.detector.Detectable;
import quiz07.detector.SpeedDetect;
import quiz07.reporter.Ripotable;
import quiz07.reporter.SpeedReport;

public class SpeedCam extends Camera implements Detectable, Ripotable {
    private Detectable d;
    private Ripotable r;
    public void setD(Detectable d) {
        this.d = d;
    }

    public void setR(Ripotable r) {
        this.r = r;
    }

    @Override
    public void showMainFeature() {
        System.out.println("특징 : 속도 측정, 번호인식");
    }

    @Override
    public void detect() {
        d.detect();
    }

    @Override
    public void report() {
        r.report();
    }
}
