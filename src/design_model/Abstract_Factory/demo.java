package design_model.Abstract_Factory;

public class demo {
    public static void main(String[] args) {
        AbstractFactory factorycolor = new Factroy().getFactory("Color");
        AbstractFactory factoryshape = new Factroy().getFactory("Shape");

    }
}
