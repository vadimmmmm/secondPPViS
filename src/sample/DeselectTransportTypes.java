package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DeselectTransportTypes extends CommandRoute{
    private String commandName = "Delect";
    @Override
    public void execute() {
        Stage stage = new Stage();
        Pane pane = new Pane();
        TextField textField = new TextField();
        textField.setLayoutX(0);
        textField.setLayoutY(0);
        Button subbmit = new Button();
        subbmit.setText("submit");
        subbmit.setLayoutX(150);
        subbmit.setLayoutY(200);

        pane.getChildren().add(subbmit);
        pane.getChildren().add(textField);
        subbmit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                stage.close();
            }
        });
        Scene scene = new Scene(pane,300,300);

        stage.setScene(scene);
        stage.setScene(scene);
        stage.setTitle("Report");
        stage.showAndWait();
    }

    public String getCommandName(){
        return this.commandName;
    }
}

