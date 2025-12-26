package Appliance;

public class Stereo {
    private Integer volume = 0;

    public Stereo() {
        System.out.println("Stereo surround system");
    }

    public void on() {
        System.out.println("The system is ON");
    }

    public void off() {
        System.out.println("The system is OFF");
    }

    public void setCD() {}
    public void sefDVD() {}
    public void setRadio() {}
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

}
