package myjavaFX;

/**
 *
 * @author Administrator
 */
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TouZi extends Application{
	public static void main(String[] a){
		Application.launch(a);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		GridPane pane = new GridPane();
                TextField tf1=new TextField();
                TextField tf2=new TextField();
                TextField tf3=new TextField();
                TextField tf4=new TextField();
		pane.add(new Label("投资总额"), 0, 0);
		pane.add(tf1, 1, 0);
		pane.add(new Label("投资年数"), 0, 1);
		pane.add(tf2, 1, 1);
                pane.add(new Label("年利率  "), 0, 2);
		pane.add(tf3, 1, 2);
                pane.add(new Label("未来值  "), 0, 3);
		pane.add(tf4, 1, 3);
		Button bt = new Button("计算");
               bt.setOnAction(e->{
               double n1=Double.parseDouble(tf1.getText());
               double n2=Double.parseDouble(tf2.getText());
               double n3=Double.parseDouble(tf3.getText());
               double s=Math.pow(1+(n3/12), n2*12);
               double temp=n1*s;
               tf4.setText(""+ temp);
            });
		pane.add(bt, 1, 4);
		pane.setPadding(new Insets(10,10,10,10));
		pane.setHgap(5);
		pane.setVgap(5);
		GridPane.setHalignment(bt, HPos.RIGHT);
		Scene scene = new Scene(pane, 250,150);
		arg0.setScene(scene);
		arg0.setTitle("投资计算器");
		arg0.show();
	}
	
}
