package test2;

public class Car{
	


private String make;
private String model;
private int year;
private double speed;

public Car(String make,String model,int year)
{
this.make=make ;
this.model=model ;
this.year=year ;
this.speed= speed;
}
public String getMake()
{
return make;
}
public void setMake(String make)
{
this.make=make ;
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
System.out.println("Make:"+make );
System.out.println("Model:"+model );
System.out.println("Year:"+ year);
System.out.println("Speed:"+ speed+"mph");
}
}
