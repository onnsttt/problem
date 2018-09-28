package design_model.Adapter_Pattern;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp3"))
            System.out.println("mp3");
        else if(audioType.equals("vlc")||audioType.equals("mp4")){
            MediaPlayer mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType,fileName);
        }
    }
}
