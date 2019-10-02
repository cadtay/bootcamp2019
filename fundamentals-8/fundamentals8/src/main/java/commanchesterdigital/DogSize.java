package commanchesterdigital;

public enum DogSize {

    SMALL("meow"),
    MEDIUM("Ruff"),
    LARGE("WOFF");

    private String noise;

    DogSize(String noise) {
        this.noise = noise;
    }

    public String getNoise() {
        return noise;
    }
}
