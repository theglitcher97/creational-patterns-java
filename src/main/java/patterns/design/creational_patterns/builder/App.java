package patterns.design.creational_patterns.builder;

public class App {
	public static void main(String[] args) {
		MySQLConfiguration.Builder builder = new MySQLConfiguration.Builder();
		MySQLConfiguration mySQLConfiguration = builder.setPassword("1234").setUrl("url").setUsername("username").build();
	}
}
