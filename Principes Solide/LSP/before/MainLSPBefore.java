//package lsp.before;

class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}

public class MainLSPBefore {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setWidth(5);
        rect.setHeight(4);
        System.out.println("Aire du rectangle = " + rect.getArea());
        Rectangle rect1 = new Square();
        rect1.setWidth(5);
        rect1.setHeight(4);
        System.out.println("Aire du carré = " + rect1.getArea());
    }
}
