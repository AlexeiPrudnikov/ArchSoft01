package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Texture> Textures;
    public List<Poligon> Poligons;

    public PoligonalModel(List<Poligon> Poligons) {
        Textures = new ArrayList<>();
        this.Poligons = Poligons;
    }
}
