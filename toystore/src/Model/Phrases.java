package Model;

public enum Phrases {
    WRONG_PATH("!!!!Wrong file path!!!!"),
    ENTER_PATH("Enter path of file: ");

    private String value;

    Phrases(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
