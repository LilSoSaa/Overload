

public class Shape {

    public String shapeName;
    public int numberOfEdges;


    public Shape() {
        System.out.println("Object shape has been created");
    }

    public Shape(Double radius) {
        System.out.println("A Circle has been ctreated");
        this.shapeName = "Circle";
    }

    public Shape(int edge, Double edgeLenght) {
        System.out.println("A Square has been ctreated");
        this.shapeName = "Square";
        this.numberOfEdges = 4;
    }

    public Shape(int edge, Double edgeFirst, Double edgeSecond) {
        System.out.println("A Rectangle has been ctreated");
        this.shapeName = "Rectangle";
        this.numberOfEdges = 4;
    }

    public Shape(int edge, Double edgeFirst, Double edgeSecond, Double edgeThird) {
        System.out.println("A Triangle has been ctreated");
        this.shapeName = "Triangle";
        this.numberOfEdges = 3;
    }


    public String getShapeDetails(Shape shape) {
        return shapeName + numberOfEdges;

    }

}

