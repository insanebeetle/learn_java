package chap_03;

public class _07_method {
    public static int power2(int a, int b){
        return (int)Math.pow(a,b);
    };
    //오버로딩
    //오버로딩을 사용해 재사용 할수도 있음
    //ex파라메타 적은 것 안에 많은 것 넣기 등.
    public static int power2(String a){
        //int number = Integer.parseInt(a);
        return (int)Math.pow(Integer.parseInt(a),Integer.parseInt(a));
    };

    public static String getPN(){
        String ph = "010-2222-2222";
        return ph;
    };

    public static void power(int a ,int b){
        //int result = a * a;
        System.out.println((int)Math.pow(a,b));
    }
    public static void sayHello(){
        System.out.println("헤으응...");
    }


    public static void main(String[] args) {
        sayHello();
        power(2, 4);
        String ph = getPN();
        System.out.println(ph);
        System.out.println(getPN());
        //위 두개는 같은 방법
        System.out.println(power2(4,5));
        System.out.println(power2("6"));
    }



}
