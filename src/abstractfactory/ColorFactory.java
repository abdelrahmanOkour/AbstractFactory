package abstractfactory;

public class ColorFactory extends AbstractFa{

    @Override
    Shape getShape(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    Color getColor(String type) {
        if (type.toLowerCase().equals("red")) {
            return new Red();
        }
        else if (type.toLowerCase().equals("blue")) {
            return new Blue();
        }
        else if (type.toLowerCase().equals("yellow")) {
            return new Yellow();
        }
        return null;
    }
    
}
