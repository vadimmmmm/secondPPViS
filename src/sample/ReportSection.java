package sample;

import javafx.scene.control.Button;

import java.util.ArrayList;

public class ReportSection {
    public ArrayList<Button> buttons = new ArrayList<>();
    ArrayList<CommandReport> commandReports = new ArrayList<>();

    public ReportSection() {
        this.commandReports.add(new SubmitReportedProblem());
        this.commandReports.add(new ShowMap());
    }

    public void buttonPressed(String line) {
        for(CommandReport commandReport: this.commandReports){
            for(Button button: this.buttons){
                if(button.getText().equals(commandReport.getCommandName())){
                    commandReport.execute();
                }
            }
        }
    }
}
