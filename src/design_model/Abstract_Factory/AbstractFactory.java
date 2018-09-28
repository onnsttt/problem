package design_model.Abstract_Factory;

public interface AbstractFactory {
    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);
}
