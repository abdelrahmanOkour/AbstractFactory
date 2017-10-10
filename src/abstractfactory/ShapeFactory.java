package abstractfactory;

public class ShapeFactory extends AbstractFa{
   

    @Override
    Shape getShape(String type) {
   if (type.equals(null)) {
            return null;
        }
        else if (type.toLowerCase().equals("rectangle")) {
            return new Rectangle();
        }
        else if (type.toLowerCase().equals("triangle")) {
            return new Triangle();
        }
        else if (type.toLowerCase().equals("square")) {
            return new Square();
        }
        return null;
    }

    @Override
    Color getColor(String type) {
        return null;
    }
}
