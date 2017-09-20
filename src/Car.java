
import java.awt.Color;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanita
 */
public class Car 
{
    // Hold's the car model
    // instance variable
    // Author Name: Juana Rodriguez
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
    private String model;
    // Hold's the car make;
    // Author Name: Juana Rodriguez
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
    private String make;
    // Holds the car color;
    // Author Name: Juana Rodriguez
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
    private String color;
    // Author Name: Juana Rodriguez
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
    private int yearModel;
    // Holds current speed of the car
    // Author Name: Juana Rodriguez
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
    private int speed;       
    // Car Constructor that receives parameters
    // Author Name: Juana Rodriguez
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
    public Car(String makeCar, String modelCar, String colorCar, int yearModelCar)
    {   
        // Author Name: Juana Rodriguez
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
        this.make = makeCar;
        // Author Name: Juana Rodriguez
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
        this.model = modelCar;
        // Author Name: Juana Rodriguez
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
        this.color = colorCar;
        // Author Name: Juana Rodriguez
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
        this.yearModel = yearModelCar;
        // Author Name: Juana Rodriguez
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
        this.speed = 0;              
    }
    /////////////////////////////////
    // method to set make
    // Author Name: Juana Rodriguez
    // Return Value: void
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
    public void setMake(String make)
    {
        // Author Name: Juana Rodriguez
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
        this.make = make;
    }    
    // Author Name: Juana Rodriguez
    // methodd to retrive the make
    // Rerutn Value: String
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
    public String getMake()
    {
       // Author Name: Juana Rodriguez
       // Date: 9/17/2017, 9/18/2017, 9/19/2017
        return make;
    }   
    // method to set the model
    // Author Name: Juana Rodriguez
    // Return Value: void
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
    public void setModel(String model)
    {
        // Author Name: Juana Rodriguez
        // Date: 9/17/2017, 9/18/2017, 9/19/2017
        this.model = model;
    }
    // method to retrieve the model
    // Author Name: Juana Rodriguez
    // Return Value: String
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
    public String getModel()
    {
        // Author Name: Juana Rodriguez
        // Date: 9/17/2017, 9/18/2017, 9/19/2017
        return model;
    }
    ////////////////////////////////
    // method to set the color
    // Author Name: Juana Rodriguez
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
    public void setColor(String color)
    {
        // Author Name: Juana Rodriguez
        // Date: 9/17/2017, 9/18/2017, 9/19/2017
        this.color = color;
    }
    // method to retrive the color
    // Author Name: Juana Rodriguez
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
    public String getColor()
    {
        // Author Name: Juana Rodriguez
        // Date: 9/17/2017, 9/18/2017, 9/19/2017
        
        return color;
    }
    ////////////////////////////////
    // method to set the yearModel
    // Author Name: Juana Rodriguez
    // Reurn Value: void
    public void setYearModel(int yearModel)
    {
        // Author Name: Juana Rodriguez
        // Date: 9/17/2017, 9/18/2017, 9/19/2017
        this.yearModel = yearModel;
    }
    // method to retrive the year Model
    // Author Name: Juana Rodriguez
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
    public int getYearModel()
    {
        //Return: yearModel
        // Author Name: Juana Rodriguez
        // Date: 9/17/2017, 9/18/2017, 9/19/2017
        return yearModel;
    }
    /////////////////////////////////
    // method to set the speed
    // Author Name: Juana Rodriguez
    // Return: Returns a int
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
    public int getSpeed()
    {
        // Author Name: Juana Rodriguez
        // Date: 9/17/2017, 9/18/2017, 9/19/2017
        return speed;
    }
    //  method to set the speed
    // Author Name: Juana Rodriguez
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
    public void setSpeed(int speed)
    {
       this.speed = speed;
    }
    /////////////////////////////////
    // 
    // Purpose: method to retrive the accelarate speed
    // Author Name: Juana Rodriguez
    // Return: returns a int
    // Date: 9/17/2017, 9/18/2017, 9/19/2017
    public int accelerate()
    {        
        // incease the speed to 5
        // Author Name : Juana Rodriguez
        // Date: 9/19/2017
        speed += 5; 
        // Naame if Stament: if Stament
        // if purpose: the speed will stop in 200
        // Author Name: Juana Rodriguez
        // Date: 9/18/2017, 9/19/2017
        if(speed > 201)
        {
            // Sets the spedd to 200
            speed = 200;
        }
        // returns the speed
        return speed;
    }
    // Method to retrive the brake
    public int brake()
    {
        // decrease the speed to 5
        // Author Name : Juana Rodriguez
        // Date: 9/19/2017
        speed -= 5;
        // Naame if Stament: if Stament
        // if purpose: the speed will stop in 0
        // Author Name: Juana Rodriguez
        // Date: 9/18/2017, 9/19/2017
        if(speed < 0)
        {
            // sets the speed to 0
            speed = 0;
        }
        // returns the speed
        return speed;
    }
}
