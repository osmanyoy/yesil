package com.yapikredi.java.dp.creational.builder.connection;

public class Connection {
	private String desc;
	private String ip;
	private int port;
	
	private Connection() {
	}
	
	public String getDesc() {
		return desc;
	}
	public String getIp() {
		return ip;
	}
	public int getPort() {
		return port;
	}
	
	public static ConnectionBuilder getBuilder() {
		return new ConnectionBuilder();
	}
	
	
	@Override
	public String toString() {
		return "Connection [desc=" + desc + ", ip=" + ip + ", port=" + port + "]";
	}


	public static class ConnectionBuilder{
		private Connection connection = new Connection();
		
		private ConnectionBuilder() {
		}
		public ConnectionBuilder withDesc(String desc) {
			connection.desc = desc;
			return this;
		}
		public ConnectionBuilder withIp(String ip) {
			connection.ip = ip;
			return this;
		}
		public ConnectionBuilder withPort(int port) {
			connection.port = port;
			return this;
		}
		
		public Connection build() throws Exception {
			if (connection.desc == null || connection.desc.isEmpty()) {
				throw new Exception("Desc boþ olamaz");
			}
			if (connection.ip == null || connection.ip.isEmpty()) {
				throw new Exception("Desc boþ olamaz");
			}
			return connection;
		}

	}
	
	
}
