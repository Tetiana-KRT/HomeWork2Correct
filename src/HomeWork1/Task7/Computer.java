package HomeWork1.Task7;

public class Computer {

    private String brand;
    private String screenSize;
    private int numberOfCores;
    private String type;

    public Computer (String brand, String screenSize){
        this.brand = brand;
        this.screenSize = screenSize;
        System.out.println("The computer of brand " + brand + " was created");
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public int getNumberOfCores(){
        return numberOfCores;
    }
    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public String getType(){
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

}
