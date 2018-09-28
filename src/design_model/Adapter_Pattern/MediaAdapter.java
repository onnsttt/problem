package design_model.Adapter_Pattern;

public class MediaAdapter implements MediaPlayer{
    AdvanceMediaPlayer advanceMediaPlayer;


    public MediaAdapter(String autioType){
        if(autioType.equals("vlc"))
            advanceMediaPlayer = new Vlcplayer();
        else if(autioType.equals("mp4"))
            advanceMediaPlayer = new Mp4Player();
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("vlc"))
            advanceMediaPlayer.playVlc(fileName);
        else if(audioType.equals("mp4"))
            advanceMediaPlayer.playMp4(fileName);
    }
}