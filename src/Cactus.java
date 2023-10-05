public class Cactus extends Plant {
    private LiquidType preferredLiquid = LiquidType.MINERALWATER;

    public Cactus(String name, double heightInMetres) {
        super(name, heightInMetres);
    }
    @Override
    public double dailyLiquidInLitres() {
        return 0.02;
    }

    public String getPreferredLiquid() {
        return this.preferredLiquid.getLiquid();
    }
}

