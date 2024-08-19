import java.util.Scanner;

public class AgricultureManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter soil type (LOAMY, CLAY, SANDY, PEATY): ");
        String soilTypeInput = scanner.next().toUpperCase();

        SoilType soilType;
        try {
            soilType = SoilType.valueOf(soilTypeInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid soil type entered. Defaulting to LOAMY.");
            soilType = SoilType.LOAMY;
        }
        System.out.println("Enter soil pH level (e.g., 6.5): ");
        double pHLevel = scanner.nextDouble();

        System.out.println("Enter soil nutrient level (e.g., 2.5): ");
        double nutrientLevel = scanner.nextDouble();
        Soil mySoil = new Soil(soilType, pHLevel, nutrientLevel);
        CropSoilManagementSystem managementSystem = new CropSoilManagementSystem();

        System.out.println("Soil Details: " + mySoil);
        Crop recommendedCrop = managementSystem.recommendCrop(mySoil);
        System.out.println("Recommended Crop: " + recommendedCrop);
        managementSystem.monitorSoil(mySoil);
        managementSystem.diagnoseDisease(recommendedCrop);
        System.out.println("Enter the amount of fertilizer to apply: ");
        double fertilizerAmount = scanner.nextDouble();
        mySoil.applyFertilizer(fertilizerAmount);

        scanner.close();
    }
}

