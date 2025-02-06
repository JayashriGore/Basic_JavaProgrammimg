package encapsulation;
class IndirectAcces1_VeriableAndMethods //written by senior Dev becuse sensetive info
{
	 private String username="jayashrigore5@gmail.com"; //Sensetive info as private
	
	 public String getUsername() {  //Using genrating getter and Setter Method
		return username;  // for utilizing setting thing(veriable) it use    return keyword
	}
	public void setUsername(String username) // Parameter is String usrname so it taking String
	{
		this.username = username; // whatrver we are setting passing it to global veriable for fteching information
	}
	private String password="Test@123";// for pass or another veriable also do same like usename

	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password; 
	}
	
}
public class IndirectAcces2_VeriableAndMethods // access the things indirectly by team
{

	public static void main(String[] args)
	{
		IndirectAcces1_VeriableAndMethods e1= new IndirectAcces1_VeriableAndMethods();// with help of ref veriable called non satatic method 
		                                               //and setted username 
		                                             // with the help of this keyword updating same local veriable to global veriable
		                                            // after updating to the global veriable he will not hold original values ,it is updated with users email id
		                                            // after that your truing to fetch the value ,Retuen the username
		e1.setUsername("abc@gmail.com");
		System.out.println(e1.getUsername());// 
		
		e1.setPassword("abc@123");
		System.out.println(e1.getPassword());
		
	}

}

