package quiz07;

import quiz07.Camera.Camera;
import quiz07.Camera.SpeedCam;
import quiz07.detector.AccidentDetect;
import quiz07.detector.SpeedDetect;
import quiz07.reporter.SpeedReport;

public class _02_Quiz {
    public static void main(String[] args) {
        SpeedCam sc = new SpeedCam();
        SpeedDetect sd = new SpeedDetect();
        SpeedReport sr = new SpeedReport();
        AccidentDetect ad =new AccidentDetect();
        sc.setD(sd);
        sc.setR(sr);
        sc.detect();
        sc.report();
        sc.setD(ad);
        sc.detect();
        sc.report();

    }
}
