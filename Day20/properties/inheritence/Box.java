package Day20.properties.inheritence;

public class Box {
    double l;
    double h;
    double w;

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side) {
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box oldBox) {
        this.h = oldBox.h;
        this.l = oldBox.l;
        this.w = oldBox.w;
    }
}
