package patterns.design.creational_patterns.builder;

public class MySQLConfiguration {
	private String url;
	private String username;
	private String password;

	private MySQLConfiguration() {}

	private MySQLConfiguration(Builder builder) {
		this.url = builder.url;
		this.username = builder.username;
		this.password = builder.password;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public static class Builder {
		private String url;
		private String username;
		private String password;

		public Builder () {}

		public Builder setUrl(String url) {
			this.url = url;
			return this;
		}

		public Builder setUsername(String username) {
			this.username = username;
			return this;
		}

		public Builder setPassword(String password) {
			this.password = password;
			return this;
		}

		public MySQLConfiguration build(){
			return new MySQLConfiguration(this);
		}
	}
}
