public abstract class Plant implements LiquidInfo {
    // Exempel på inkapsling. Variablerna är private och kan inte nås utifrån utan setters och getters. Just dessa har
    // inga setters dock.
    private double heightInMetres;
    private String name;

    public Plant(String name, double heightInMetres) {
        if (heightInMetres <= 0) {
            throw new IllegalArgumentException("The plant must have a positive value as height.");
        }
        this.name = name;
        this.heightInMetres = heightInMetres;
    }

    public String getName() {
        return this.name;
    }

    public double getHeightInMetres() {
        return heightInMetres;
    }

}
