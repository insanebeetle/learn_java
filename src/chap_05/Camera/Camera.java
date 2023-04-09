package chap_05.Camera;

public class Camera {
    public String name;

    public Camera() {
        this.name = "카메라";
    }

    protected Camera(String name){
        this.name = name;
    }
    public void takePicture(){
        System.out.println("사진찍기");
    }

    public void recordVideo(){
        System.out.println("비디오 녹화");
    }
}
