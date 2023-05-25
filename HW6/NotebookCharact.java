package HW6;

public class NotebookCharact {
    String manufacture;
    String model;
    Integer price;
    Integer memoryValue;
    String opSyst;
    String color;
    Double screenSize;
    Integer yearOfRelease;
    Integer ssdVolume;

    NotebookCharact(String manufacture, String model, Integer price, Integer memoryValue, String opSyst, String color, 
                  Double screenSize, Integer yearOfRelease, Integer ssdVolume){
        this.manufacture = manufacture;
        this.model = model;
        this.price = price;
        this.memoryValue = memoryValue;
        this.opSyst = opSyst;
        this.color = color;
        this.screenSize = screenSize;
        this.yearOfRelease = yearOfRelease;
        this.ssdVolume = ssdVolume;
    }

    void printDescr() {
        System.out.println(manufacture + " " + model);
        System.out.println(price + " " + "USD");
        System.out.println("memory: " + memoryValue + "GB" + "/" + "system: " + opSyst);
        System.out.println();
    }

}
