package controllers;

import javafx.scene.control.Button;
import models.MainModel;
import views.MainPanel;

public class MainController {
    MainPanel mainPanel;
    MainModel mainModel;
    public MainController() {
        this.mainPanel=new MainPanel();
        this.handleEvent();
        this.mainModel = new MainModel();
    }
    public MainPanel getMainPanel(){
        return this.mainPanel;
    }
    public void handleEvent(){
        Button calcButton=this.mainPanel.getButtonPanel().getCalcButton();
        calcButton.setOnAction(e -> {

            String sideStr=this.mainPanel.getSidePanel().getValue();
            String alpStr =this.mainPanel.getAlphaPanel().getValue();
            double side = Double.parseDouble(sideStr);
            double alpha = Double.parseDouble(alpStr);
            double radius = this.mainModel.calcRadius(side, alpha);
            System.out.println(radius);
            mainPanel.getRadiusPanel().setValue(String.valueOf(radius));

        });
    }
}
