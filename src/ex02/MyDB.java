package ex02;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MyDB implements Initializable{
	@FXML private Button btn;
	@FXML private TextField idField;
	@FXML private TextField pwField;
	
	private HashMap<String, String> table;
	public MyDB() {
		table = new HashMap();
		table.put("if", "if1234");
		table.put("else", "else1234");
		table.put("while", "while1234");
		table.put("for", "for1234");
		table.put("admin", "admin1234");
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btn.setOnAction(e->{
			MyDisplay();
		});
	}
	
	public void MyDisplay() {
		if(idField.getText().isEmpty() == true && pwField.getText().isEmpty() == true) {
			MyId();
		}else if(idField.getText().isEmpty() == false && pwField.getText().isEmpty() == true){
			MyPw();
		}else if(idField.getText().isEmpty() == false && pwField.getText().isEmpty() == false){
			MyPrint();
		}
	}
	public void MyPrint() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("메시지");					// 타이틀
		alert.setHeaderText("메시지");			// 제목
		alert.setContentText("성공");				// 내용
		alert.show();
	}
	public void MyId() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("메시지");					// 타이틀
		alert.setHeaderText("메시지");			// 제목
		alert.setContentText("idTextField를 입력해야 합니다");			
		alert.show();
	}
	public void MyPw() {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("메시지");					// 타이틀
			alert.setHeaderText("메시지");			// 제목
			alert.setContentText("pwTextField를 입력해야 합니다");
			alert.show();
	}
	
}
