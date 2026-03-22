package Day20.properties.inheritence;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxPrice other) {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // call the parent class constructor
        // used to initialize values present in parent class
        this.weight = weight;
    }

}
