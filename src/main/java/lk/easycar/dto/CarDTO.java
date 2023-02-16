package lk.easycar.dto;

import java.math.BigDecimal;

public class CarDTO {
    private String vehicleNum;
    private String model;
    private String VehicleType;
    private String TransmissionType;
    private String color;
    private String FuelType;
    private int passengers;
    private BigDecimal monthlyPrice;
    private BigDecimal dailyPrice;
    private int freeMileage;
    private boolean available;

    public CarDTO(String vehicleNum, String model, String vehicleType, String transmissionType, String color, String fuelType, int passengers, BigDecimal monthlyPrice, BigDecimal dailyPrice, int freeMileage, boolean available) {
        this.vehicleNum = vehicleNum;
        this.model = model;
        VehicleType = vehicleType;
        TransmissionType = transmissionType;
        this.color = color;
        FuelType = fuelType;
        this.passengers = passengers;
        this.monthlyPrice = monthlyPrice;
        this.dailyPrice = dailyPrice;
        this.freeMileage = freeMileage;
        this.available = available;
    }

    public CarDTO() {
    }

    public String getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getTransmissionType() {
        return TransmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        TransmissionType = transmissionType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return FuelType;
    }

    public void setFuelType(String fuelType) {
        FuelType = fuelType;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public BigDecimal getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(BigDecimal monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public BigDecimal getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(BigDecimal dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public int getFreeMileage() {
        return freeMileage;
    }

    public void setFreeMileage(int freeMileage) {
        this.freeMileage = freeMileage;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "vehicleNum='" + vehicleNum + '\'' +
                ", model='" + model + '\'' +
                ", VehicleType='" + VehicleType + '\'' +
                ", TransmissionType='" + TransmissionType + '\'' +
                ", color='" + color + '\'' +
                ", FuelType='" + FuelType + '\'' +
                ", passengers=" + passengers +
                ", monthlyPrice=" + monthlyPrice +
                ", dailyPrice=" + dailyPrice +
                ", freeMileage=" + freeMileage +
                ", available=" + available +
                '}';
    }
}
