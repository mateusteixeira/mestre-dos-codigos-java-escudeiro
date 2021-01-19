package knowingtheplatform.workingwithoop.workwithabstract;

public abstract class Animal {

    private String species;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public abstract void getSoundMadeBy();

}
