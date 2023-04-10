package quiz07.Camera;

public abstract class Camera {
    public void takePicture(){
        System.out.println("사진활영");
    }
    public void takeVideo(){
        System.out.println("동영상활영");
    }
    public abstract void showMainFeature();
    //자식클래스에서 구현해야되는 부분
}
