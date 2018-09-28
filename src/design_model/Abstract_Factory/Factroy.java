package design_model.Abstract_Factory;

public class Factroy {
    public AbstractFactory getFactory(String choice){
        if(choice.equals("Shape"))
            return new ShapeFactory();
        if(choice.equals("Color"))
            return new ColorFactory();
        return null;
    }
}
