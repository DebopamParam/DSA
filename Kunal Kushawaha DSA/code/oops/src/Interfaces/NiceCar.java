package Interfaces;

public class NiceCar {
    private Engine engine;
    private Mirrors mirror;
    private MediaPlayer player;

    public NiceCar() {
        this.engine = new PetrolEngine();
        this.mirror = new CarMirrors();
        this.player = new SoundSystem();
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void give_Surrounding_Status() {
        mirror.seeRearView();
        mirror.seeSideMirrorLeft();
        mirror.seeSideMirrorRight();
    }

    public void start_music() {
        player.start();
    }

    public void stop_music() {
        player.stop();
    }

}
