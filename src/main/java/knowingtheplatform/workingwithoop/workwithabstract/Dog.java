package knowingtheplatform.workingwithoop.workwithabstract;

public class Dog extends Animal{

    @Override
    public void getSoundMadeBy() {
        System.out.println("Species " + this.getSpecies() + " make: auauau");
    }
}
