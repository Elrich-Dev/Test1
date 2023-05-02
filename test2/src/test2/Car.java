package test2;

public class Car{
	


private String set;
private String model;
private int year;
private double speed;

public Car(String set,String model,int year)
{
this.set=set ;
this.model=model ;
this.year=year ;
this.speed= speed;
}
public String getset()
{
return set;
}
public void setset(String set)
{
this.set=set ;
}
public  String getModel()
{
return model;
}
public void setModel(String model)
{
this.model= model;
}
public int getYear()
{
return year;
}
public void setYear(int year)
{
this.year=year ;
}
public double getSpeed()
{
return speed;
}
public void accelerate(double amount)
{
speed+= amount;
}
public void brake(double amount)
{
speed-=amount ;
}
public void printInfo(){
System.out.println("Set:"+set );
System.out.println("Model:"+model );
System.out.println("Year:"+ year);
System.out.println("Speed:"+ speed+"mph");
}
}
