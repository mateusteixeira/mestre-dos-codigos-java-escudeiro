package knowingtheplatform.workingwithoop.workingwithpolymorphism;

public class TV {

    private int inches;
    private int actualChannel;
    private int actualVolume;
    private boolean isOn;

    public TV(int inches) {
        this.inches = inches;
        this.actualChannel = 0;
        this.actualVolume = 0;
        this.isOn = false;
    }

    public int getInches() {
        return inches;
    }

    public int getActualChannel() {
        return actualChannel;
    }

    public int getActualVolume() {
        return actualVolume;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setActualChannel(int actualChannel) {
        this.actualChannel = actualChannel;
    }

    public void setActualVolume(int actualVolume) {
        this.actualVolume = actualVolume;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
