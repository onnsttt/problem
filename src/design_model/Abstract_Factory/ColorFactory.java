package design_model.Abstract_Factory;

public class ColorFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color.equals("Red"))
            return new Red();
        if(color.equals("Blue"))
            return new Blue();
        return null;
    }
}
