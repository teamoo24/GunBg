package com.android.mini;

public class Gold {
	int x,y;
	int enegy;
	boolean IsLive;
	boolean mFrist;
	int alpha;
	public Gold(int _x, int _y)
	{
		x=_x;
		y=_y;
		IsLive=true;
		alpha=5;
		mFrist=true;
	}
	public int getX() {
		return x;
	}
	public void setX(int _x) {
		this.x = _x;
	}
	public int getY() {
		return y;
	}
	public void setY(int _y) {
		this.y = _y;
	}
	public int getEnegy() {
		return enegy;
	}
	public void setEnegy(int _enegy) {
		this.enegy = _enegy;
	}
	public int getAlpha()
	{
		return alpha;
	}
	public boolean getLive(){
		return IsLive;
	}
	public void function_alpha(){
		if(mFrist)
		{
			if(alpha==255)
			{
				mFrist=false;
				alpha-=5;
			}
			else
			{
				alpha+=10;
			}
		}
		else
		{
			if(alpha==0)
			{
				IsLive=false;
			}
			else
				alpha-=10;
		}
	}
}
