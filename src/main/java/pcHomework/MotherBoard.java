package pcHomework;

public class MotherBoard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String string, String s, int i, int i1, String x) {
    }

    public void loadProgram(String photoshop) {
    }
    public void Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadprogram(String programName){
        System.out.println(programName + "is now running: ");
    }
    @Override
    public String toString() {
        return "Motherboard: Model " + model + ", Manufacturer " + manufacturer +
                ", RAM Slots " + ramSlots + ", Card Slots " + cardSlots + ", BIOS " + bios;
    }

   
}
