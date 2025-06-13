package lektion17;

public enum Geschlecht {
    MÄNNLICH("XY"), WEIBLICH("XX");

    private String chromosom;
    private Geschlecht(String chromosom){
        this.chromosom = chromosom;
    }

    public String getChromosom() {
        return this.chromosom;
    }
}
