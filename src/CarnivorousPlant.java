public class CarnivorousPlant extends Plant {
    private LiquidType preferredLiquid = LiquidType.PROTEINDRINK;

    public CarnivorousPlant(String name, double heightInMetres) {
        super(name, heightInMetres);
    }

    @Override
    public double dailyLiquidInLitres() {
        return (0.2 * this.getHeightInMetres()) + 0.1;
    }

    public String getPreferredLiquid() {
        return this.preferredLiquid.getLiquid();
    }
}