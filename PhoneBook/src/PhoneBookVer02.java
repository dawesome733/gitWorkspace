import java.util.Scanner;

class PhoneBookVer02 
{
	static Scanner keyboard=new Scanner(System.in);
	
	public static void showMenu()
	{
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է� ");
		System.out.println("2. ���α׷� ����");
		System.out.print("���� : ");
	}
	
	public static void readData()
	{
		System.out.print("�̸� : ");
		String name=keyboard.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phoneNumber=keyboard.nextLine();
		System.out.print("������� : ");
		String birthday=keyboard.nextLine();
		
		PhoneInfo pInfo=new PhoneInfo(name, phoneNumber, birthday);
		System.out.println("�Էµ� ���� ���...");
		pInfo.showPhoneInfo();
	}
	
	public static void main(String[] args)
	{
		int choice;
		
		while(true)
		{
			showMenu();
			choice=keyboard.nextInt();
			keyboard.nextLine();
			
			switch(choice)
			{
			case 1:
				readData();
				break;
			case 2:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}
