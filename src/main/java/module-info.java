module patterns.design.creational_patterns {
	requires javafx.controls;
	requires javafx.fxml;


	opens patterns.design.creational_patterns to javafx.fxml;
	exports patterns.design.creational_patterns;
}