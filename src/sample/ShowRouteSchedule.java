package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ShowRouteSchedule extends CommandSchudule{
    private String commandName = "Schedule";
    @Override
    public void execute() {
        Stage stage = new Stage();
        Pane pane = new Pane();
        Scene scene = new Scene(pane,100,100);
        stage.setScene(scene);
        stage.setTitle("schedule");
        stage.showAndWait();
    }

    public String getCommandName(){
        return this.commandName;
    }
}
