
class PhoneInfo 
{
	private String name;
	private String phoneNumber;
	private String birthday;
	
	PhoneInfo(String name, String phoneNumber)
	{
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birthday=null;
	}
	PhoneInfo(String name, String phoneNumber, String birthday)
	{
		this(name, phoneNumber);
		this.birthday=birthday;
	}
	public void showPhoneInfo()
	{
		System.out.println("name : " + name);
		System.out.println("phoneNumber : " + phoneNumber);
		if(birthday != null)
			System.out.println("birthday : " + birthday);
		
		System.out.println("");
	}
}
