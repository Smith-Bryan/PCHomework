package pcHomework;

public class PC {
    private Case pcCase;
    private MotherBoard motherboard;
    private Monitor monitor;

    public PC(Case pcCase, MotherBoard motherboard, Monitor monitor) {
        this.pcCase = pcCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }
    private void drawLogo(){
        monitor.drawPixel(10,10,"Blue");
    }
    public void description() {
        System.out.println("Welcome to worst buy below is the description of the PC on sale today:");
        System.out.println(pcCase);
        System.out.println(motherboard);
        System.out.println(monitor);
    }
    public void powerUp() {
        pcCase.pressPowerButton();
        drawLogo();
        pcCase.pressPowerButton();
        motherboard.loadProgram("Photoshop");
    }
}
