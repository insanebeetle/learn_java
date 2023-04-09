package chap_05;

public class BlackBox {
    String model;
    String resolution;
    int price;
    String color;

    int sereialNumber;

    static int counter = 0;
    static boolean canAutoRep = false;
    //static이 붙으면 '클래스 변수' 모든 객체에 적용됨
    //위 모델이나 가격등은 '인스턴스 변수'로 객체가 따로 적용
    //접근 할때는 BlackBox(클래스명).autoRep 으로 접근해야한다

    //생성자
    BlackBox(){
        System.out.println("기본생성자호출");
        this.sereialNumber = ++counter;
        System.out.println("새로운 시리얼넘버 발급");
    }
    BlackBox(String model,String resolution,int price, String color){
        this(); //기본 생성자를 실행시키는 호출
        this.model =model;
        this.resolution=resolution;
        this.price=price;
        this.color=color;

    }


    void autoRep(){
        if(canAutoRep){
            System.out.println("신고 ㄱ");
        }else {
            System.out.println("자살 ㄱ");
        }
    }

    void record(boolean dateTime, boolean speed, int min){
        if (dateTime){
            System.out.println("날짜정보");
        }
        if(speed){
            System.out.println("속도");
        }
        System.out.println(min);
    }
    void record(){
        record(false,false,10);
        //오버로딩을 이용해 재활용하는 방식
    }

    static void calling(){
        System.out.println("스태틱 함수");
        //model = "test" 클래스내 인스턴스변수는 static안에서 변경 불가-객체생성후가능
        canAutoRep = false;//스태틱변수는 어디든 사용가능해서 노 문제
    }

    public void appendModel(String model) {
        this.model += model;
        System.out.println(this.model);
        //model += model의 경우 둘다 파라메타임 기존의 인스턴스변수를 가져오려면 this를 사용
    }

    //getter Setter
    String getModel(){
        if(model == null  ||  model.isEmpty()){
            return "판매자에게 문의하세요";
        }
        return model;
    }
    void setModel(String model){
        this.model = model;
    }
    void setPrice(int price){
        if(price < 200000){
            this.price = 200000;
        }else{
            this.price = price;
        }
    }
}
