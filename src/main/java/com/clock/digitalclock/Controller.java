package com.clock.digitalclock;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    //if we want to use current time
    Time time = new Time(new CurrentTime().currentTime());

//    if we want to use specific time
//    Time time = new Time("00:00:00");

    @FXML
    private Text timer;

    @FXML
    private TextField alarmTime;

    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1),
            e -> {
                if (time.getCurrentTime().equals(alarmTime.getText())) {
                    System.out.println("ALARM!!! ALARM!!! ALARM!!!");
                }
                time.timeFlow();
                timer.setText(time.getCurrentTime());
            }));

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        timer.setText(time.getCurrentTime());
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}