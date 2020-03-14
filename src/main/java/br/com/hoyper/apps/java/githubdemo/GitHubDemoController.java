package br.com.hoyper.apps.java.githubdemo;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class GitHubDemoController extends GitHubDemo {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonClose;

    @FXML
    public void onActionButtonClose(ActionEvent event) {
    	super.onActionButtonClose(event);
    }
    
    @FXML
    void initialize() {
        assert buttonClose != null : "fx:id=\"buttonClose\" was not injected: check your FXML file 'GitHubDemo.fxml'.";

    }
}
