package abstractfactory;
public class FactoryProducer {
    public static  AbstractFa getFactory(String type){
        if (type.toLowerCase().equals("shape")) {
            return new ShapeFactory();
        }
        else if (type.toLowerCase().equals("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
