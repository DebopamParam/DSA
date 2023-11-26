package Interfaces;

public class SoundSystem implements MediaPlayer{
    @Override
    public void start() {
        System.out.println("Start Music");
    }

    @Override
    public void stop() {
        System.out.println("Stop Music");
    }
}
