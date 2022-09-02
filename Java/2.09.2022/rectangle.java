class Rectangle {
    private float height = 0, width = 0, area = 0;

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getArea() {
        area = height * width;
        return area;
    }
}

class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();

        rect1.setWidth(5);
        rect1.setHeight(10);

        System.out.println(rect1.getArea());
    }
}