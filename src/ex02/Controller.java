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

public class Controller implements Initializable {
	// @로 시작하는걸 어노테이션이라함
	@FXML private Button btn;
	@FXML private TextField txtField;
	@FXML private TextField txtField02;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("초기화 목적으로 사용");
		btn.setOnAction(e->{ 	// 버튼에 이벤트발생하면
			txtPrint();
			
		});
	}
	public void txtPrint() {
			txtField02.setText(txtField.getText()); // 첫번째 txt꺼를 가져오겠다
			txtField.setText("");					// 그후 첫째 txt 지우기
		// gui창에서 버튼을 누르면 txtField창에 쓴 값이 콘솔창에 나온다.
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("메시지");					// 타이틀
			alert.setHeaderText("메시지");			// 제목
			alert.setContentText("성공");				// 내용
			alert.show();
	}
	
	public class MyDB{
		private HashMap<String, String> table;
		public MyDB(){
			table = new HashMap();
			table.put("if", "if1234");
		}
	}
	
	
	
	
}
