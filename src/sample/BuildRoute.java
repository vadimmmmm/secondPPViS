package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BuildRoute extends CommandRoute {
    private String commandName = "Build a route";

    @Override
    public void execute() {
        Stage stage = new Stage();
        Pane pane = new Pane();
        TextField textField = new TextField();
        textField.setLayoutX(0);
        textField.setLayoutY(0);

        TextField secondTextField = new TextField();
        secondTextField.setLayoutX(0);
        secondTextField.setLayoutY(20);


        Button subbmit = new Button();
        subbmit.setText("search");
        subbmit.setLayoutX(150);
        subbmit.setLayoutY(200);

        CheckBox bus = new CheckBox("Bus");
        bus.setLayoutX(200);
        bus.setLayoutY(0);

        CheckBox trolleybus = new CheckBox("trolleybus");
        trolleybus.setLayoutX(200);
        trolleybus.setLayoutY(20);

        CheckBox tram = new CheckBox("Tram");
        tram.setLayoutX(200);
        tram.setLayoutY(40);

        pane.getChildren().add(subbmit);
        pane.getChildren().add(bus);
        pane.getChildren().add(trolleybus);
        pane.getChildren().add(tram);
        pane.getChildren().add(secondTextField);
        pane.getChildren().add(textField);
        subbmit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                stage.close();
            }
        });
        Scene scene = new Scene(pane, 300, 300);

        stage.setScene(scene);
        stage.setScene(scene);
        stage.setTitle("build");
        stage.showAndWait();
    }

    public String getCommandName() {
        return this.commandName;
    }
}


