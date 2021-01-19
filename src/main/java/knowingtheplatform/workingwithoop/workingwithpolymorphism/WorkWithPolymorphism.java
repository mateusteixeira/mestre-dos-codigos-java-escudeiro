package knowingtheplatform.workingwithoop.workingwithpolymorphism;

public class WorkWithPolymorphism {

    public static void main(String[] args) {
        TVModelA tvModelA = new TVModelA(40);
        tvModelA.setTVModel("A");

        tvModelA.turnOn();
        tvModelA.changeChannelTo(10);
        tvModelA.volumeUp();
        tvModelA.volumeUp();
        tvModelA.volumeDown();
        tvModelA.turnOff();

        TVModelB tvModelB = new TVModelB(49);
        tvModelB.setTVModel("B");

        tvModelB.turnOn();
        tvModelB.changeChannelTo(10);
        tvModelB.volumeUp();
        tvModelB.volumeUp();
        tvModelB.volumeDown();
        tvModelB.turnOff();
    }
}
