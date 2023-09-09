package ModelElements;

import org.w3c.dom.Text;

public class PoligonalModel {
    Poligon poligon;
    Text texture;


    public PoligonalModel(Poligon poligon, Text texture) {
        this.poligon = poligon;
        this.texture = texture;
    }


    @Override
    public String toString() {
        return "PoligonalModel{" +
                "poligon=" + poligon +
                ", texture=" + texture +
                '}';
    }
}
