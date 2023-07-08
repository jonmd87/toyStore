package Model;

public enum Things {
    ROBOT("Robot", 2),
    DOLLY("Dolly", 2),
    CONSTRUCTOR("Constructor", 6);

    private final String label;
    private final int weight;

    Things(String label, int weight) {
        this.label = label;
        this.weight = weight;
    }

    public String getLabel() {
        return label;
    }

    public int getWeight() {
        return this.weight;
    }
}
