package chap_05;

public class _01_class {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.model="BK";
        b1.resolution="FHD";
        b1.price =200000;
        b1.color ="white";

        System.out.println(b1.canAutoRep);
        b1.canAutoRep = true;
        System.out.println(b1.canAutoRep);
        System.out.println(BlackBox.canAutoRep);
        //접근 할때는 BlackBox(클래스명).autoRep 으로 접근해야한다
        b1.autoRep();
        BlackBox.canAutoRep=false;
        b1.autoRep();

        BlackBox b2 = new BlackBox();
        b2.model = "WH";
        b2.record(false,false,10);
        b2.record();

        String s = "SEX";
        s.indexOf("x");
        b2.calling();
        BlackBox.calling();
        b2.appendModel("recent");
        System.out.println(b2.sereialNumber);

        //생성자이용
        BlackBox b3 = new BlackBox("옐로", "UHD", 300000, "BL");
        System.out.println(b3.model);
        System.out.println(b3.sereialNumber);
    }
}
