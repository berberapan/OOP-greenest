public class Palm extends Plant {
    private LiquidType preferredLiquid = LiquidType.TAPWATER;

    public Palm(String name, double heightInMetres) {
        super(name, heightInMetres);
    }
    @Override
    public double dailyLiquidInLitres() {
        return this.getHeightInMetres() / 2;
    }

    public String getPreferredLiquid() {
        return this.preferredLiquid.getLiquid();
    }
}
