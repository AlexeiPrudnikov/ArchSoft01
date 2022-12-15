package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int ID;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;

    public Scene() {
        Models = new ArrayList<>();
        Flashes = new ArrayList<>();
    }

    public boolean method1(Flash flash) {
        try {
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public int method2(PoligonalModel Model, Flash Flash) {
        try {
            return 0;
        } catch (Exception ex) {
            return -1;
        }
    }

}
