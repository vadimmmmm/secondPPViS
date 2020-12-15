package sample;

import javafx.scene.control.Button;

import java.util.ArrayList;

public class RouteSection {
    public ArrayList<Button> buttons = new ArrayList<>();
    ArrayList<CommandRoute> commandRoutes = new ArrayList<>();

    public RouteSection() {
        this.commandRoutes.add(new BuildRoute());
        this.commandRoutes.add(new MarkFavourite());
        this.commandRoutes.add(new DeselectTransportTypes());

    }

    public void buttonPressed(String line) {
        for(CommandRoute commandRoute: this.commandRoutes){
            for(Button button: this.buttons){
                if(button.getText().equals(commandRoute.getCommandName())){
                    commandRoute.execute();
                }
            }
        }
    }

    public void valueEntered(String line){

    }
}
