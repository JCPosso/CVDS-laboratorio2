package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Hexagon;
import edu.eci.cvds.patterns.shapes.concrete.Pentagon;
import edu.eci.cvds.patterns.shapes.concrete.Quadrilateral;
import edu.eci.cvds.patterns.shapes.concrete.Triangle;

public class ShapeFactory {

    static Shape create(RegularShapeType type){
        Shape shape = null;
        switch(type){
            case Triangle:
                shape = new Triangle();
            case Quadrilateral:
                shape = new Quadrilateral();
            case Hexagon:
                shape = new Hexagon();
            case Pentagon:
                shape = new Pentagon();
        }
        return shape;
    }
}
