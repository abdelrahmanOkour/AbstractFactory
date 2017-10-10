
package abstractfactory;


public class AbstractFactory {

    
    public static void main(String[] args) {
      AbstractFa shapeFactory=FactoryProducer.getFactory("shape");
      Shape shape1 = shapeFactory.getShape("triangle");

      //call draw method of Shape Circle
      shape1.draw();

      //get an object of Shape Rectangle
      Shape shape2 = shapeFactory.getShape("RECTANGLE");

      //call draw method of Shape Rectangle
      shape2.draw();
      
      //get an object of Shape Square 
      Shape shape3 = shapeFactory.getShape("SQUARE");

      //call draw method of Shape Square
      shape3.draw();

      AbstractFa colorFactory = FactoryProducer.getFactory("COLOR");

      //get an object of Color Red
      Color color1 = colorFactory.getColor("RED");

      //call fill method of Red
      color1.Fill();

      //get an object of Color Green
      Color color2 = colorFactory.getColor("yellow");

      //call fill method of Green
      color2.Fill();

      //get an object of Color Blue
      Color color3 = colorFactory.getColor("BLUE");

      //call fill method of Color Blue
      color3.Fill();

    }
    
}
