package quiz07.Camera;

import quiz07.detector.Detectable;
import quiz07.reporter.Ripotable;

public class FactoryCam extends Camera implements Detectable, Ripotable {
    private Detectable d1;
    private Ripotable r1;

    public void setD1(Detectable d1) {
        this.d1 = d1;
    }

    public void setR1(Ripotable r1) {
        this.r1 = r1;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재감지");
    }

    @Override
    public void detect() {
        d1.detect();
    }

    @Override
    public void report() {
        r1.report();
    }
}
