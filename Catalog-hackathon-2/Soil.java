class Soil {
    private SoilType type;
    private double pHLevel;
    private double nutrientLevel;

    public Soil(SoilType type, double pHLevel, double nutrientLevel) {
        this.type = type;
        this.pHLevel = pHLevel;
        this.nutrientLevel = nutrientLevel;
    }

    public SoilType getType() {
        return type;
    }

    public double getpHLevel() {
        return pHLevel;
    }

    public double getNutrientLevel() {
        return nutrientLevel;
    }

    public void applyFertilizer(double units) {
        nutrientLevel += units;
        System.out.println("Fertilizer applied: " + units + " units. New nutrient level: " + nutrientLevel);
    }

    @Override
    public String toString() {
        return "Soil{" +
                "type=" + type +
                ", pHLevel=" + pHLevel +
                ", nutrientLevel=" + nutrientLevel +
                '}';
    }
}