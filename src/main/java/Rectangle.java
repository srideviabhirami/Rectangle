public class Rectangle {
    private float length;
    private float breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public boolean isNegativeValue(){
        if(length <= 0 || breadth <=0)
            return true;
        return false;
    }

    public float area() {
        if(isNegativeValue())
            return -1;
        return length * breadth;
    }
}
