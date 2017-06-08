
public class HAS implements Lights, TV, AC  {

	private String name;
	private int num,size;
	
	public HAS(String name,int num,int size)
	{
		this.name=name;
		this.num=num;
		this.size=size;
	}
	

	@Override
	public void settemp(int t) {
		// TODO Auto-generated method stub
		AC.temp=t;
	}

	@Override
	public void tempup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tempdown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void channelup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void channeldown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setchannel(int c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getchannel() {
		// TODO Auto-generated method stub
		return 0;
	}
		
	
	
	
	
	
	

}
