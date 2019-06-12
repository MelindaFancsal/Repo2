package sci.inheritance;

public class LibraryShapes {
    private Shape[] shapes;

    public LibraryShapes(Shape[] shapesItem) {
        this.shapes = shapesItem;
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }


    public void addShape(Shape object) {
        Shape[] newArray = new Shape[shapes.length + 1];

        for (int i=0 ;i <shapes.length; i++) {

            newArray[i] = shapes[i];
        }

        newArray[shapes.length + 1] = object;

        shapes = new Shape[10];
    }
}
