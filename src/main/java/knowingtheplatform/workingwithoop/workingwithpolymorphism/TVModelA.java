package knowingtheplatform.workingwithoop.workingwithpolymorphism;

public class TVModelA extends TV implements TVFunctions, TVModel{

    private String model;

    public TVModelA(int inches) {
        super(inches);
    }


    @Override
    public void changeChannelTo(int channel) {
        System.out.println("Changing channel to: " + channel);
        super.setActualChannel(channel);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning TV on");
        super.setOn(true);
    }

    @Override
    public void turnOff() {
        System.out.println("Turning TV off");
        super.setOn(false);
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume up by one");
        super.setActualVolume(super.getActualVolume() + 1);
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume dow by one");
        super.setActualVolume(super.getActualVolume() - 1);
    }

    @Override
    public void setTVModel(String tvModel) {
        this.model = tvModel;
    }
}
