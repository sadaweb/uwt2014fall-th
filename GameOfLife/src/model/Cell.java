package model;

enum States
{
	Dead,
	Alive
}

public class Cell
{
	private States state=States.Dead;
	
	public States getState()
	{
		return state;
	}
	
	public void setState(States state)
	{
		this.state=state;
	}
	
	public void update(int i)
	{
		if (i>5)
		{
			state=States.Alive;
		}
		else
		{
			state=States.Dead;
		}
	}
}
