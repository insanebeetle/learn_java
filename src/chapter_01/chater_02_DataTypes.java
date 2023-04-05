package chapter_01;

public class chater_02_DataTypes {
    public static void main(String[] args) {
        String name = "SEX King!";
        int hour = 2;
        long bigger = 1000_000_000_000_000l;
        float score = 15.55f;
        double times = 1.222;
        char grade = 'A';
        System.out.println(name + hour + times + score + grade);
        System.out.println(bigger);

        final String CONSTANT = "King SEX";
        final double Pi = 3.1415926;

        String s1 = String.valueOf(93);
        System.out.println(s1.getClass().getName());

        String s2 =Double.toString(92);
        System.out.println(s2.getClass().getName());

        int s3 = Integer.parseInt("873");
        System.out.println(s3);

        String busNum = "상암08";
        int arrive_min = 3;
        double distance = 1.2;

        System.out.println(busNum + "번 버스");
        System.out.println("약 " +arrive_min+"분 후 도착");
        System.out.println("남은 거리 "+distance+"km");
    }
}

