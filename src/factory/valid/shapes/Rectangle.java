package factory.valid.shapes;

/**
 * Source: https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
