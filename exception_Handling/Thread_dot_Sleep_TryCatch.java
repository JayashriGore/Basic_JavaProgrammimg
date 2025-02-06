package exception_Handling;

public class Thread_dot_Sleep_TryCatch {

	public static void main(String[] args) {
		for (int i=1;i<=10;i++)	
		{
			System.out.println("Jayashri");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 
			}
		}
	}

}
