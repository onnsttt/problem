package design_model.Abstract_Factory;

public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if(shape.equals("BMW"))
            return new Bmw();
        if(shape.equals("Benz"))
            return new Benz();
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
