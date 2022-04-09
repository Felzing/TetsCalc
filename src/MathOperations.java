public enum MathOperations {
    PLUS ("+"),
    MINUS ("-"),
    MULTIPLE ("*"),
    DIVISION ("/");

    private final String name;

    private MathOperations(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        // (otherName == null) check is not needed because name.equals(null) returns false
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}
