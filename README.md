# Agriculture Management Application

## Overview
This application helps manage crop and soil data for better agricultural practices. It provides functionalities like crop recommendations, soil monitoring, disease diagnosis, and fertilizer application.

## File Descriptions
- **`AgricultureManagementApp.java`**: Main entry point of the application where users input soil details and receive recommendations and diagnostics.
- **`Soil.java`**: Defines the `Soil` class with properties and methods related to soil data.
- **`Crop.java`**: Defines the `Crop` class with properties and methods related to crop data.
- **`CropType.java`**: Enum defining different types of crops.
- **`SoilType.java`**: Enum defining different types of soil.
- **`CropSoilManagementSystem.java`**: Contains the logic for recommending crops, monitoring soil, and diagnosing diseases.

## Special Features

- **Dynamic Input**: Users can dynamically input soil type, pH level, nutrient level, and fertilizer amount.
- **Error Handling**: The application handles invalid soil type inputs by defaulting to `LOAMY` and provides appropriate messages for other invalid inputs.
- **Real-Time Feedback**: Users receive immediate recommendations and diagnostics based on their inputs, helping in making informed decisions.
- **Interactive**: The command-line interface allows for a straightforward interaction where users can see immediate effects of their inputs.

## How to Run
1. Compile all Java files:
   ```bash
   javac *.java
