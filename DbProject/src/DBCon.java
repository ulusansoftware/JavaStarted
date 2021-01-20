import java.sql.*;
import java.util.Scanner;

public class DBCon {

	public static void main(String[] args) throws SQLException {
		Connection c = DriverManager.getConnection("jdbc:mariadb://localhost:3325/car?user=root");
		Statement st = c.createStatement();
		Scanner scan = new Scanner(System.in);
		//System.out.println("Araba Adý :");
		//String name = scan.nextLine();

		//System.out.println("Araba Hýzý :");
		//int speed = scan.nextInt();
		/*
		String query = "INSERT INTO cars (cars_name,cars_speed) VALUES('" + name +
		 * "'," + speed + ")"; int sonuc = st.executeUpdate(query);
		 * System.out.println(sonuc); st.close();
		 */
		/*
		 * String q = "INSERT INTO cars (cars_name,cars_speed) VALUES (?,?)";
		 * PreparedStatement pt = c.prepareStatement(q); pt.setString(1, name);
		 * pt.setInt(2, speed); pt.executeUpdate();
		 */

		ResultSet rs = st.executeQuery("SELECT * FROM cars");

		while (rs.next()) {
			System.out.println(rs.getInt("cars_id") + "-" + rs.getString("cars_name") + "-" + rs.getInt("cars_speed"));
		}

	}

}
