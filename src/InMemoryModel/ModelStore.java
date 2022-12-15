package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangedObserver> ChangeObservers;

    public ModelStore(List<PoligonalModel> Models, List<Scene> Scenes, List<Flash> Flashes, List<Camera> Cameras) {
        this.Models = Models;
        this.Scenes = Scenes;
        this.Flashes = Flashes;
        this.Cameras = Cameras;
        ChangeObservers = new ArrayList<>();
    }

    /**
     * Возвращает scena по ID
     *
     * @param ID
     * @return
     */
    public Scene GetScena(int ID) {
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).ID == ID) {
                return Scenes.get(i);
            }

        }
        return null;
    }

    /**
     * Регистрация изменений
     * @param sender
     */
    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}
