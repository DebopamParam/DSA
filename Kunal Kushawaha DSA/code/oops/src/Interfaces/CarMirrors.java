package Interfaces;

public class CarMirrors implements Mirrors {
    @Override
    public void seeRearView() {
        System.out.println("Rear mirror Clear");
    }

    @Override
    public void seeSideMirrorLeft() {
        System.out.println("Right side mirror Clear");
    }

    @Override
    public void seeSideMirrorRight() {
        System.out.println("Left side mirror Truck coming");
    }
}
