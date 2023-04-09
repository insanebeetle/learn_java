package chap_05;

public class BlackBox2 {
    private String model;
    private String resolution;
    private int price;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getResolution() {
        if(resolution == null  ||  resolution.isEmpty()){
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price < 200000){
            this.price = 200000;
        }else{
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
