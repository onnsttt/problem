package design_model.Adapter_Pattern;


public class Vlcplayer implements AdvanceMediaPlayer{
    public void playVlc(String filename){
        System.out.println("play vlc "+filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}
