package me.xamrah.coursepps;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class LoginController {
    @FXML
    private PasswordField pass;
    @FXML
    private TextField email;

    public void login(){
        DbRepo dbRepo = new DbRepo();
        try {
            if(dbRepo.checkAutorizeUser(email.getText(), pass.getText())){
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Запрос отправлен");
                alert.setHeaderText("Поздравляю, вы 13411313й в очереди из 13411316!");
                alert.setContentText("Скоро страница загрузится!");
                alert.showAndWait();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Ошибка");
                alert.setHeaderText("Данного пользователя не существует!");
                alert.setContentText("Пройдите регистрацию....");
                alert.showAndWait();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
