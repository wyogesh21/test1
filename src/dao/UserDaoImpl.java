package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static utils.DBUtils.*;

import pojos.User;

public class UserDaoImpl implements UserDao {
	// state :
	private Connection cn;
	private PreparedStatement pst1;


	public UserDaoImpl() throws SQLException {
		
		cn = openConnection();
		
		pst1 = cn.prepareStatement("select * from users");
		
		System.out.println("user dao created!");
	}

	@Override
	public List<User> getSelectedUserDetails() throws SQLException {
		// create empty AL
		List<User> users = new ArrayList<>();
		
		
		try (ResultSet rst = pst1.executeQuery()) {
			
			while (rst.next())
				users.add(new User(rst.getInt(1), rst.getString(2), rst.getString(3)));
		} // rst.close()
		return users;
	}

	

	// clean up of DB resources , invoked by Tester , once , in the shut down of app
	public void cleanUp() throws SQLException {
		if (pst1 != null)
			pst1.close();
		
		closeConnection();
		System.out.println("user dao cleaned up....");
	}

}
