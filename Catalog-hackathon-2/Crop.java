class Crop {
    private CropType type;
    private double waterRequirement;  
    private double nutrientRequirement; 

    public Crop(CropType type, double waterRequirement, double nutrientRequirement) {
        this.type = type;
        this.waterRequirement = waterRequirement;
        this.nutrientRequirement = nutrientRequirement;
    }

    public CropType getType() {
        return type;
    }

    public double getWaterRequirement() {
        return waterRequirement;
    }

    public double getNutrientRequirement() {
        return nutrientRequirement;
    }

    @Override
    public String toString() {
        return "Crop{" +
                "type=" + type +
                ", waterRequirement=" + waterRequirement +
                ", nutrientRequirement=" + nutrientRequirement +
                '}';
    }
}