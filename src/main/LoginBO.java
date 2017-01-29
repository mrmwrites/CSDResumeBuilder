package main;

public class LoginBO {

	public boolean validate(Login login, String button) {
		// TODO Auto-generated method stub
	
		if ("Login".equals(button))
		{
			if(login.getUserName().equals("mrmwrites") && login.getPassword().equals("Swami@12345"))
			{
				System.out.println("Login successful");
				return true;
			}
			else
				return false;
	//	return true; //--"Login successful";

		}

		else
			return false;// return false; //"Login failed";
	}
}
