package cr.ud.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.sqlite.SQLiteConfig;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {

		return "index";
	}

	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public @ResponseBody ArrayList<HashMap> userList(Locale locale, Model model) {
		Connection connection = null;
		ArrayList<HashMap> data = new ArrayList<HashMap>();
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			connection = DriverManager.getConnection("jdbc:sqlite:/C:\\Tomcat\\ajax.db", config.toProperties());

			String query = "SELECT * FROM users"; // name LIKE '%" + name + "%'
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				String birthday = resultSet.getString("birthday");
				HashMap<String, String> row = new HashMap<String, String>();
				row.put("idx", "" + idx);
				row.put("name", name);
				row.put("address", address);
				row.put("birthday", birthday);
				data.add(row);
			}
			preparedStatement.close();
			connection.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "/userInsert", method = RequestMethod.GET)
	public @ResponseBody HashMap<String, String> userInsert(@RequestParam("name") String name, 
																						  @RequestParam("address") String address,
																						  @RequestParam("birthday") String birthday) {
		Connection connection = null;
		HashMap<String, String> result = new HashMap<String, String>();
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			connection = DriverManager.getConnection("jdbc:sqlite:/C:\\Tomcat\\ajax.db", config.toProperties());
			
			String query = "INSERT INTO users (name, address, birthday) VALUES ('" + name + "', '" + address + " ' ,"+" ' "+birthday+" ' );";
			Statement statement = connection.createStatement();
			int q = statement.executeUpdate(query);
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		result.put("result", "success");
		return result;
	}

}
