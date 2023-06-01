package me.xamrah.coursepps;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class HelloController {

    @FXML
    private Slider sliderDate;

    @FXML
    private Label dateText;

    @FXML
    private Label phoneText;

    @FXML
    private Slider phone1;
    @FXML
    private Slider phone2;
    @FXML
    private Slider phone3;
    @FXML
    private Slider phone4;
    @FXML
    private Slider phone5;
    @FXML
    private Slider phone6;
    @FXML
    private Slider phone7;
    @FXML
    private Slider phone8;
    @FXML
    private Slider phone9;
    @FXML
    private Slider phone10;
    @FXML
    private PasswordField name;
    @FXML
    private PasswordField sex;
    @FXML
    private PasswordField email1;
    @FXML
    private PasswordField email2;
    @FXML
    private PasswordField email3;
    @FXML
    private PasswordField email4;
    @FXML
    private PasswordField email5;
    @FXML
    private TextField passField;
    @FXML
    private Button button1;
    @FXML
    private ImageView scream;
    @FXML
    private Button button11;
    @FXML
    private Button button12;
    @FXML
    private Button button13;
    @FXML
    private Button button14;
    @FXML
    private Button button15;


    @FXML
    public void initialize() {


        sliderDate.valueProperty().addListener((observable, oldValue, newValue) -> {
            SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
            Date moment = new Date(newValue.longValue());
            String strDate = sdfDate.format(moment);
            dateText.setText(strDate);
        });
        AtomicInteger phoneNum1 = new AtomicInteger();
        AtomicInteger phoneNum2 = new AtomicInteger();
        AtomicInteger phoneNum3 = new AtomicInteger();
        AtomicInteger phoneNum4 = new AtomicInteger();
        AtomicInteger phoneNum5 = new AtomicInteger();
        AtomicInteger phoneNum6 = new AtomicInteger();
        AtomicInteger phoneNum7 = new AtomicInteger();
        AtomicInteger phoneNum8 = new AtomicInteger();
        AtomicInteger phoneNum9 = new AtomicInteger();
        AtomicInteger phoneNum10 = new AtomicInteger();
        phone1.valueProperty().addListener((observable, oldValue, newValue) -> {
            phoneNum1.set(newValue.intValue());
            phoneText.setText("+7" + phoneNum1.get() + phoneNum2.get()+ phoneNum3.get()+ phoneNum4.get()+ phoneNum5.get()+ phoneNum6.get()+ phoneNum7.get()+ phoneNum8.get()+ phoneNum9.get()+ phoneNum10.get());
        });
        phone2.valueProperty().addListener((observable, oldValue, newValue) -> {
            phoneNum2.set(newValue.intValue());
            phoneText.setText("+7" + phoneNum1.get() + phoneNum2.get()+ phoneNum3.get()+ phoneNum4.get()+ phoneNum5.get()+ phoneNum6.get()+ phoneNum7.get()+ phoneNum8.get()+ phoneNum9.get()+ phoneNum10.get());
        });
        phone3.valueProperty().addListener((observable, oldValue, newValue) -> {
            phoneNum3.set(newValue.intValue());
            phoneText.setText("+7" + phoneNum1.get() + phoneNum2.get()+ phoneNum3.get()+ phoneNum4.get()+ phoneNum5.get()+ phoneNum6.get()+ phoneNum7.get()+ phoneNum8.get()+ phoneNum9.get()+ phoneNum10.get());
        });
        phone4.valueProperty().addListener((observable, oldValue, newValue) -> {
            phoneNum4.set(newValue.intValue());
            phoneText.setText("+7" + phoneNum1.get() + phoneNum2.get()+ phoneNum3.get()+ phoneNum4.get()+ phoneNum5.get()+ phoneNum6.get()+ phoneNum7.get()+ phoneNum8.get()+ phoneNum9.get()+ phoneNum10.get());
        });
        phone5.valueProperty().addListener((observable, oldValue, newValue) -> {
            phoneNum5.set(newValue.intValue());
            phoneText.setText("+7" + phoneNum1.get() + phoneNum2.get()+ phoneNum3.get()+ phoneNum4.get()+ phoneNum5.get()+ phoneNum6.get()+ phoneNum7.get()+ phoneNum8.get()+ phoneNum9.get()+ phoneNum10.get());
        });
        phone6.valueProperty().addListener((observable, oldValue, newValue) -> {
            phoneNum6.set(newValue.intValue());
            phoneText.setText("+7" + phoneNum1.get() + phoneNum2.get()+ phoneNum3.get()+ phoneNum4.get()+ phoneNum5.get()+ phoneNum6.get()+ phoneNum7.get()+ phoneNum8.get()+ phoneNum9.get()+ phoneNum10.get());
        });
        phone7.valueProperty().addListener((observable, oldValue, newValue) -> {
            phoneNum7.set(newValue.intValue());
            phoneText.setText("+7" + phoneNum1.get() + phoneNum2.get()+ phoneNum3.get()+ phoneNum4.get()+ phoneNum5.get()+ phoneNum6.get()+ phoneNum7.get()+ phoneNum8.get()+ phoneNum9.get()+ phoneNum10.get());
        });
        phone8.valueProperty().addListener((observable, oldValue, newValue) -> {
            phoneNum8.set(newValue.intValue());
            phoneText.setText("+7" + phoneNum1.get() + phoneNum2.get()+ phoneNum3.get()+ phoneNum4.get()+ phoneNum5.get()+ phoneNum6.get()+ phoneNum7.get()+ phoneNum8.get()+ phoneNum9.get()+ phoneNum10.get());
        });
        phone9.valueProperty().addListener((observable, oldValue, newValue) -> {
            phoneNum9.set(newValue.intValue());
            phoneText.setText("+7" + phoneNum1.get() + phoneNum2.get()+ phoneNum3.get()+ phoneNum4.get()+ phoneNum5.get()+ phoneNum6.get()+ phoneNum7.get()+ phoneNum8.get()+ phoneNum9.get()+ phoneNum10.get());
        });
        phone10.valueProperty().addListener((observable, oldValue, newValue) -> {
            phoneNum10.set(newValue.intValue());
            phoneText.setText("+7" + phoneNum1.get() + phoneNum2.get()+ phoneNum3.get()+ phoneNum4.get()+ phoneNum5.get()+ phoneNum6.get()+ phoneNum7.get()+ phoneNum8.get()+ phoneNum9.get()+ phoneNum10.get());
        });

        TranslateTransition transition = new TranslateTransition(Duration.seconds(0.6), button1);
        transition.setFromX(0); // начальная позиция по X
        transition.setToX(400); // конечная позиция по X
        transition.setFromY(0); // начальная позиция по X
        transition.setToY(300); // конечная позиция по X
        transition.setAutoReverse(true); // автоматическое возвращение в исходное положение
        transition.setCycleCount(TranslateTransition.INDEFINITE); // повторение анимации бесконечное количество раз

        transition.play();

        TranslateTransition transition1 = new TranslateTransition(Duration.seconds(0.6), button11);
        transition1.setFromX(200); // начальная позиция по X
        transition1.setToX(500); // конечная позиция по X
        transition1.setAutoReverse(true); // автоматическое возвращение в исходное положение
        transition1.setCycleCount(TranslateTransition.INDEFINITE); // повторение анимации бесконечное количество раз
        transition1.play();
        TranslateTransition transition2 = new TranslateTransition(Duration.seconds(3), button12);
        transition2.setFromY(200); // начальная позиция по X
        transition2.setToY(500); // конечная позиция по X
        transition2.setAutoReverse(true); // автоматическое возвращение в исходное положение
        transition2.setCycleCount(TranslateTransition.INDEFINITE); // повторение анимации бесконечное количество раз
        transition2.play();
        TranslateTransition transition3 = new TranslateTransition(Duration.seconds(0.1), button12);
        transition3.setFromY(0); // начальная позиция по X
        transition3.setToY(800); // конечная позиция по X
        transition3.setAutoReverse(true); // автоматическое возвращение в исходное положение
        transition3.setCycleCount(TranslateTransition.INDEFINITE); // повторение анимации бесконечное количество раз
        transition3.play();

        // Запуск анимации

        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(5), sliderDate);
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(0.2), scream);

        rotateTransition.setByAngle(360); // угол поворота
        rotateTransition.setCycleCount(RotateTransition.INDEFINITE); // бесконечное повторение анимации
        rotateTransition.setAutoReverse(false); // отключение автоматического возвращения в исходное положение
        rotateTransition.play();


        fadeTransition.setFromValue(0.0); // начальная прозрачность
        fadeTransition.setToValue(1.0); // конечная прозрачность
        fadeTransition.setCycleCount(FadeTransition.INDEFINITE);
        fadeTransition.setAutoReverse(true);
        // Запуск анимации
        fadeTransition.play();

    }

    public void checkPassoword(){
//        fadeTransition.play();


        int length = 30; // Длина случайной строки

        // Допустимые символы для случайной строки
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+=}";

        // Создание объекта Random
        Random random = new Random();

        // Создание StringBuilder для построения случайной строки
        StringBuilder sb = new StringBuilder(length);

        // Генерация случайной строки
        for (int i = 0; i < length; i++) {
            // Получение случайного индекса символа из строки characters
            int randomIndex = random.nextInt(characters.length());

            // Получение случайного символа и добавление его к StringBuilder
            char randomChar = characters.charAt(randomIndex);
            sb.append(randomChar);
        }

        // Получение финальной случайной строки
        String randomString = sb.toString();

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("ВАШ ПАРОЛЬ");
        alert.setHeaderText("ВАШ ПАРОЛЬ?");
        alert.setContentText(sb.toString());

        // Добавление кнопок в диалоговое окно
        ButtonType buttonTypeYes = new ButtonType("Да");
        ButtonType buttonTypeNo = new ButtonType("Да");
        ButtonType buttonTypeCancel = new ButtonType("Нет (Да)");

        alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNo, buttonTypeCancel);

        // Отображение диалогового окна и ожидание ответа пользователя
        alert.showAndWait().ifPresent(response -> {
            if (response == buttonTypeYes) {
                passField.setText(sb.toString());
            } else if (response == buttonTypeNo) {
                passField.setText(sb.toString());
            } else if (response == buttonTypeCancel) {
                passField.setText("");
            }
        });
    }

    public void fakeComplete(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Эта функция ещё не введена");
        alert.setHeaderText("Попробуйте позже!");

        // Отображение предупреждения с ошибкой
        alert.showAndWait();
    }
    public void complete(){
        if (!email1.getText().equals(email2.getText()) || !email2.getText().equals(email3.getText()) || !email3.getText().equals(email4.getText()) || !email4.getText().equals(email5.getText()) || !email1.getText().equals(email5.getText())) {
            // Создание объекта Alert с типом ошибки
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setHeaderText("Почта не совпала((");

            // Отображение предупреждения с ошибкой
            alert.showAndWait();
        }
        if (name.getText().isEmpty() || sex.getText().isEmpty() || email1.getText().isEmpty() || passField.getText().isEmpty() || dateText.getText().isEmpty()){
            // Создание объекта Alert с типом ошибки
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setHeaderText("Не все поля заполнены!");
            alert.setContentText("Повторите попытку!");

            // Отображение предупреждения с ошибкой
            alert.showAndWait();
        } else {
            DbRepo dbRepo = new DbRepo();
            try {
                dbRepo.createUser(name.getText(), sex.getText(), passField.getText(), dateText.getText(), email1.getText());
            } catch (SQLException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Ошибка");
                alert.setHeaderText("Произошла неизвестная ошибка!");
                alert.setContentText("Возможно такой email уже существует!");
                alert.showAndWait();
            }
        }


    }

    public void login(){
        Stage newWindow = new Stage();
        newWindow.setTitle("Логин");
//Create view from FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
//Set view in window
        try {
            newWindow.setScene(new Scene(loader.load()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//Launch
        newWindow.show();
    }
}