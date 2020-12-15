package sample;

import javafx.scene.control.Button;

import java.util.ArrayList;

public class Menu {
    public ArrayList<Button> buttons = new ArrayList<>();
    ArrayList<CommandSelectSection> commandSelectSections = new ArrayList<>();

    public Menu() {
        this.commandSelectSections.add(new CommandSelectSection());

    }

    public void buttonPressed(String line) {
        for(CommandSelectSection commandSelectSection: this.commandSelectSections){
            for(Button button: this.buttons){
                if(button.getText().equals(commandSelectSection.getCommandName())){
                    commandSelectSection.execute();
                }
            }
        }
    }
}
