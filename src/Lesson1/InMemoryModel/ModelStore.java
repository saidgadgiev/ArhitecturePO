package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements IModelChanger{
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    public ModelStore(IModelChangeObserver changeObserver) {
        this.models = new PoligonalModel(null, null);
        this.cameras = new Camera(null, null);
        this.flashes = new Flash(null, null, null, 0);
        this.scenes = new Scene(models, flashes, cameras);
    }
    public Scene getScena(int n){
        return this.scenes;
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
