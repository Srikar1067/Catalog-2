class CropSoilManagementSystem {

    public Crop recommendCrop(Soil soil) {
        switch (soil.getType()) {
            case LOAMY:
                return new Crop(CropType.WHEAT, 5.0, 2.0);
            case CLAY:
                return new Crop(CropType.RICE, 6.0, 3.0);
            case SANDY:
                return new Crop(CropType.COTTON, 4.5, 2.5);
            default:
                return new Crop(CropType.SOYBEAN, 5.5, 3.0);
        }
    }

    public void monitorSoil(Soil soil) {
        if (soil.getpHLevel() < 5.5) {
            System.out.println("Soil pH is low. Consider adding lime.");
        } else if (soil.getpHLevel() > 7.5) {
            System.out.println("Soil pH is high. Consider adding sulfur.");
        } else {
            System.out.println("Soil pH is optimal.");
        }
    }

    public void diagnoseDisease(Crop crop) {
        if (crop.getType() == CropType.RICE) {
            System.out.println("Brown spot disease detected in rice crop. Apply fungicide.");
        } else {
            System.out.println("No disease detected in " + crop.getType() + " crop.");
        }
    }
}
