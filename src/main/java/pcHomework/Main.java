package pcHomework;

public class Main { public static void main(String[] args) {
    Resolution monitorResolution = new Resolution(1444, 2160);
    Monitor monitor = new Monitor(monitorResolution, "123456", "Lenovo");

    Dimensions caseDimensions = new Dimensions(15.0, 7.0, 13.5);
    Case pcCase = new Case("94KU", "Best Case Co.", "500W", caseDimensions);

    MotherBoard motherboard = new MotherBoard("RYZEN AMD", "AMD Corp.", 5, 6, "v2.1");


    PC myPC = new PC(pcCase, motherboard, monitor);
    myPC.powerUp();
    myPC.description();
}

}
