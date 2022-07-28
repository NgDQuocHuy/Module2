package resizeable;

import shape.Circle;

public class resizeCircle extends Circle implements  Resizeable{

    @Override
    public void resize(double percent) {
        System.out.println(super.getRadius() * percent);
    }
}
