package sample;

import javafx.scene.control.Button;

import java.util.ArrayList;

public class ScheduleSection {
    public ArrayList<Button> buttons = new ArrayList<>();
    ArrayList<CommandSchudule> commandSchudules = new ArrayList<>();

    public ScheduleSection() {
        this.commandSchudules.add(new ShowRouteSchedule());
        this.commandSchudules.add(new ShowStoppingPointSchedule());
    }

    public void buttonPressed(String line) {
        for(CommandSchudule commandSchudule: this.commandSchudules){
            for(Button button: this.buttons){
                if(button.getText().equals(commandSchudule.getCommandName())){
                    commandSchudule.execute();
                }
            }
        }
    }
}
