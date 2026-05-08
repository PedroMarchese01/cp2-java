import controllers.MainController;
import controllers.SeedController;

public class Main {

    public static void main() {
        SeedController.seed();
        MainController.run();
    }
}
