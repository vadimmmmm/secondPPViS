package sample;

import javafx.scene.control.Button;

import java.util.ArrayList;

public class FavouriteSection {
    public ArrayList<Button> buttons = new ArrayList<>();
    ArrayList<CommandSelectRouteForBuilding> commandSelectRouteForBuildings = new ArrayList<>();

    public FavouriteSection() {
        this.commandSelectRouteForBuildings.add(new CommandSelectRouteForBuilding());

    }

    public void buttonPressed(String line) {
        for(CommandSelectRouteForBuilding commandSelectRouteForBuilding: this.commandSelectRouteForBuildings){
            for(Button button: this.buttons){
                if(button.getText().equals(commandSelectRouteForBuilding.getCommandName())){
                    commandSelectRouteForBuilding.execute();
                }
            }
        }
    }
}
