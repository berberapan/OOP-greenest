public enum LiquidType {
    TAPWATER ("Tap Water"),
    MINERALWATER ("Mineral Water"),
    PROTEINDRINK ("Protein Drink");

    public final String liquid;

    LiquidType(String liquid) {
        this.liquid = liquid;
    }

    String getLiquid() {
        return this.liquid;
    }

}
