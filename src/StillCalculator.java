//U10316053
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;

import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class StillCalculator extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane display = new GridPane();
		Button B1 = new Button("1");
		B1.setPrefSize(80, 80);
		Button B2 = new Button("2");
		B2.setPrefSize(80, 80);
		Button B3 = new Button("3");
		B3.setPrefSize(80, 80);
		Button B4 = new Button("4");
		B4.setPrefSize(80, 80);
		Button B5 = new Button("5");
		B5.setPrefSize(80, 80);
		Button B6 = new Button("6");
		B6.setPrefSize(80, 80);
		Button B7 = new Button("7");
		B7.setPrefSize(80, 80);
		Button B8 = new Button("8");
		B8.setPrefSize(80, 80);
		Button B9 = new Button("9");
		B9.setPrefSize(80, 80);
		Button B0 = new Button("0");
		B0.setPrefSize(80, 80);
		Button Bequ = new Button("=");
		Bequ.setPrefSize(80, 80);
		Button Badd = new Button("+");
		Badd.setPrefSize(80, 80);
		Button Bsub = new Button("-");
		Bsub.setPrefSize(80, 80);
		Button Bmul = new Button("*");
		Bmul.setPrefSize(80, 80);
		Button Bdiv = new Button("÷");
		Bdiv.setPrefSize(80, 80);
		Button Bsign = new Button("±");
		Bsign.setPrefSize(80, 80);
		Button Bddiv = new Button("√");
		Bddiv.setPrefSize(80, 80);
		Button Bpa = new Button("%");
		Bpa.setPrefSize(80, 80);
		Button BC = new Button("C");
		BC.setPrefSize(80, 80);
		Button BCE = new Button("CE");
		BCE.setPrefSize(80, 80);
		Button Bdot = new Button(".");
		Bdot.setPrefSize(80, 80);
		Button BMadd = new Button("M+");
		BMadd.setPrefSize(80, 80);
		Button BMsub = new Button("M-");
		BMsub.setPrefSize(80, 80);
		Button BMS = new Button("MS");
		BMS.setPrefSize(80, 80);
		
		display.add(B1,0,0);
		display.add(B2,1,2);
		display.add(B3,1,3);
		display.add(B4,1,4);
		display.add(B5,1,5);
		display.add(B6,1,6);
		display.add(B7,1,7);
		display.add(B8,1,8);
		display.add(B9,1,9);
		display.add(B0,1,10);
		display.add(Bequ,1,11);
		display.add(Badd,1,12);
		display.add(Bsub,1,13);
		display.add(Bmul,1,14);
		display.add(Bdiv,1,15);
		display.add(Bsign,1,15);
		display.add(Bddiv,1,15);
		display.add(Bpa,1,15);
		display.add(BC,1,15);
		display.add(BCE,1,15);
		display.add(Bdot,1,15);
		display.add(BMadd,1,15);
		display.add(BMsub,1,15);
		display.add(BMS,1,15);
		
		
		MenuBar bar = new MenuBar();
		// --- Menu View
		Menu menu1 = new Menu("檢視");
		// --- Menu Edit
		Menu menu2 = new Menu("編輯");
		// --- Menu Help
		Menu menu3 = new Menu("說明");
		
		
		bar.getMenus().addAll(menu1,menu2,menu3);
		display.add(bar,0,0,6,1);
		Scene scene = new Scene(display,Color.BLACK);
		
		primaryStage.setTitle("小算盤"); 
		// Set the stage title
		primaryStage.setScene(scene); 
		// Place the scene in the stage
		primaryStage.show();
	}
	
	
	public static void main(String[] args) { 
		launch(args);
	}
}
