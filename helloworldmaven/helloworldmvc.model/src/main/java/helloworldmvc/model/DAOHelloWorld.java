package helloworldmvc.model;
import helloworldmvc.contract.IModel;

public class DAOHelloWorld implements IModel  {

	private static String FileName = "HelloWorld.txt";
	private static DAOHelloWorld instance  = null;
	private String helloWorldMessage = null;
	private Model model;
	private DAOHelloWorld() {
		
	}
	public static DAOHelloWorld getInstance() {
		return instance;
	}
	public static void setInstance(DAOHelloWorld instance) {
		DAOHelloWorld.instance = instance;
	}
	private void readFile() {
		
	}
	public String getHelloWorldMessage() {
		return helloWorldMessage;
	}
	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}
	public String getHelloWorld() {
		// TODO Auto-generated method stub
		return null;
	}
}