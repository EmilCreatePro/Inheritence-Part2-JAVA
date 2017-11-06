
abstract class AvionType  
{
	protected String PlaneID;
	protected int totalEnginePower;
	
	public AvionType(String ID, int pow )
	{
		PlaneID = ID;
		totalEnginePower = pow;
	}
	
	public String getPlaneID()
	{
		return PlaneID;
	}
	
	public int getEnginePower()
	{
		return totalEnginePower;
	}
	
	public void land()
	{
		System.out.println(getPlaneID() + " " + getEnginePower() +" Initiating landing procedure - Enabling airbrakes - Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete");
	}
	
	public void takeOff()
	{
		System.out.println(getPlaneID() + " " + getEnginePower() +"- Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking o- Retracting gear - Takeoff complete");
	}
	
	public void fly()
	{
		System.out.println(getPlaneID() + " " + getEnginePower() +" - Flying");
	}
	
}

class AvionCalator extends AvionType
{
	
	protected int maxPassengers;
	
	public AvionCalator(String id, int pow, int maxPas)
	{
		super(id, pow);
		maxPassengers = maxPas;
	}
	
	public int getMaxPassengers()
	{
		return maxPassengers;
	}
}

class Concorde extends AvionCalator
{
	public Concorde(String id, int pow, int maxPas)
	{
		super(id, pow, maxPas);	
	}
	
	public void goSuperSonic()
	{
		System.out.println(getPlaneID() + getEnginePower() +" - Supersonic mode activated");
	}
	
	public void goSubSonic()
	{
		System.out.println(getPlaneID() + getEnginePower() +" - Supersonic mode deactivated");
	}
}

class AvionLupta extends AvionType
{
	public AvionLupta(String id, int pow)
		{
			super(id,pow);
		}
	public void LaunchMissile()
	{
		System.out.println(getPlaneID() + getEnginePower() +" - - Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete");
	}
	
}

class Mig extends AvionLupta
{
	public Mig(String id, int pow)
	{
		super(id,pow);
	}
	
	public void highSpeedGeometry()
	{
		System.out.println(getPlaneID() + getEnginePower() +" - High Speed Geometry Selected");
	}
	
	public void normalSpeedGeometry()
	{
		System.out.println(getPlaneID() + getEnginePower() +" - Normal Speed Geometry Selected");
	}
}

class TomCat extends AvionLupta
{
	public TomCat(String id, int pow)
	{
		super(id,pow);
	}
	
	public void refuel()
	{
		System.out.println(getPlaneID() + getEnginePower() +" - Initiating refueling procedure - Locating refueller - Catching up - Refueling - Refueling complete");
	}

}

class Main
{
	public static void main(String arg[])
	{
		/*
		AvionCalator ac1, ac2, ac3;
		AvionLupta al1, al2;
		*/
		
		AvionType ac1, ac2, ac3, al1, al2;
		
		ac1 = new AvionCalator("Boeing", 334, 450);
		ac2 = new AvionCalator("Airbus", 400, 670);
		ac3 = new Concorde("Concorde", 800, 256);
		
		al1 = new Mig("Mig", 930);
		al2 = new TomCat("TomCat", 890);
		
		ac1.takeOff();
		ac1.fly();
		ac1.land();
		
		ac2.takeOff();
		ac2.fly();
		ac2.land();
		
		ac3.takeOff();
		ac3.fly();
		ac3.land();
		((Concorde)ac3).goSuperSonic();
		((Concorde)ac3).goSubSonic();
		
		al1 = new Mig("Mig", 790);
		al1.takeOff();
		al1.fly();
		al1.land();
		((Mig)al1).normalSpeedGeometry();
		
		al2 = new TomCat("TomCat", 790);
		al2.takeOff();
		al2.fly();
		al2.land();
		((TomCat)al2).refuel();
	
	}
}



