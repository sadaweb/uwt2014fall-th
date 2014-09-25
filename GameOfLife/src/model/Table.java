package model;

public class Table
{
	private Cell cells[][];
	
	public Table(int width, int height)
	{
		cells=new Cell[height][width];
	}
	
	int offset[][]={
			{-1,-1},
			{-1,0},
			{-1,+1},
			{0,-1},
			//{0,0},
			{0,+1},
			{+1,-1},
			{+1,0},
			{+1,+1},
			
	};

	public static int mod (int x, int m){ return (x % m + m) % m; }
	
	public void update()
	{
		for (int i=0;i<cells.length;i++)
		{
			for (int j=0;i<cells.length;j++)
			{
				int temp=0;
				for (int k=0;k<8;k++)
				{
					temp+=(cells[mod(i+offset[k][0],cells.length)][mod(j+offset[k][1],cells[i].length)].getState().equals(States.Alive)?1:0);
				}
				cells[i][j].update(temp);
			}
		}
	}
}
