package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawer {
    private String color;

    protected Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
