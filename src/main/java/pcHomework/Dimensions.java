package pcHomework;

public class Dimensions {
    private int width;
    private int height;
    private int depth;

    public Dimensions(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    @Override
    public String toString(){
        return "Dimensions: " + width + "x" + height + "x" + depth;
    }
}
