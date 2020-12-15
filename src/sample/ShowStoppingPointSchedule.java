package sample;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowStoppingPointSchedule extends CommandSchudule {
    private String commandName = "moreSchedule";

    @Override
    public void execute() {
        Stage stage = new Stage();
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 100, 100);
        stage.setScene(scene);
        stage.setTitle("moreSchedule");
        stage.showAndWait();
    }

    public String getCommandName() {
        return this.commandName;
    }

}
