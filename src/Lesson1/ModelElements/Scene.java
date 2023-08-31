package ModelElements;

public class Scene {
    static int count = 0;
    int id;
    PoligonalModel models;
    Flash flashes;
    Camera camera;
    public Scene(PoligonalModel models, Flash flashes, Camera cameras) {
        this.flashes = flashes;
        this.models = models;
        this.camera = cameras;
        this.id = count++;
    }
    <T> T method1(T type){return type;}
    <T> T method2(T type, T type2){return type;}
}
