package design_model.Adapter_Pattern;

public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("play mp4"+filename);
    }
}
