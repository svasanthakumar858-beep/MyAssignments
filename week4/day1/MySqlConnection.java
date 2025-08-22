package week4.day1;

public abstract class MySqlConnection implements DatabaseConnection{
	// Implementing all abstract methods of the interface DatabaseConnection
	public void connect() {
		System.out.println("connect method implemented in abstract class");
	}
	public void disconnect() {
		System.out.println("disconnect method implemented in abstract class");
	}
	public void executeUpdate() {
		System.out.println("executeUpdate method implemented in abstract class");
	}
	public abstract void executeQuery();
}


