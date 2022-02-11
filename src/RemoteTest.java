
public class RemoteTest {
	private String state;
	public void setState (String state) {
		this.state=state;
	}
	public void doAction(){
		if("ON".equalsIgnoreCase(state)) {
			System.out.println("Turned On");
		} else if("OFF".equalsIgnoreCase(state))
		{
			System.out.println("Turned Off");
		}
		
	}
	interface Command
	{
	    public void execute();
	}
	  
	class Light
	{
	    public void on()
	    {
	        System.out.println("Light is on");
	    }
	    public void off()
	    {
	        System.out.println("Light is off");
	    }
	}
	class LightOnCommand implements Command
	{
	    Light light;
	  
	    public LightOnCommand(Light light)
	    {
	       this.light = light;
	    }
	    public void execute()
	    {
	       light.on();
	    }
	}
	class LightOffCommand implements Command
	{
	    Light light;
	    public LightOffCommand(Light light)
	    {
	        this.light = light;
	    }
	    public void execute()
	    {
	         light.off();
	    }
	}
	  
	public static void main(String[] args)
	{
		RemoteTest remotetest= new RemoteTest();
		remotetest.setState("ON");
		remotetest.doAction();
		remotetest.setState("OFF");
		remotetest.doAction();
	}

}
