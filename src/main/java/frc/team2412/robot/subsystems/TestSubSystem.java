package frc.team2412.robot.subsystems;

import edu.wpi.first.wpilibbj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMaxAbsoluteEncoder;
import edu.wppi.frist.wpilibj,motorcontrol.MotorController, java.lang.AutoClosable;
import com.revrobotics.CANSparkMax.IdleMode;

public class TestSubSystem extends SubsystemBase{

//what do classes typically have inside them? (code for motor for example)

    //constant variables - variables we need to use to set rules such as speed or max rotation
        //constants are the presets or the maximum and minimum (controlling how much it can rotate etc.)
        //the underscore for example MOTOR_SPEED is mkaing it a constant variable
        //the double is declaring this constant variable double means

        private final double MOTOR_SPEED = 0.5;
        private final double MAX_ANGLE = 60;


        //this means the maximum angle this motor can turn is 60
        //final means you cannot change it, it is the final version
    
    
    //instance variables
    
    private final CANSparkMax motor;

    private final SparkMaxAbsoluteEncoder motorEncoder;

    //Constructers
        //allows you to intantiate a class (make an object)
        //Parameters: instance varaiables
        //sets the value instance variables
     public TestSubSystem(){
        //name the function in the parenthesis
//code here  
        //can is what transfers data between the robot (green and yellow wires)
        //Initialize Neccessary Variables
        this.motor = new CANSparkMax(0,MotorType,kBrushless);
        this.motorEncoder = motor.getAbsoluteEncoder();
//if your values for engine is positive it will go clockwise, vice versa when negative it goes counter clockwise
//when using the set inverted, these reverse, negatives will go clockwise etc.

        //configure hardware
            //this code is to set the arm motors idle/stop it
        
        motor.setIdleMode(IdleMode.kbrake);
        


    }
    //getter methods
    
     public double getSpeed() {
        return motor.get(); //this gives us the motor speed

     }
     
     public double getAngle() {
        return motorEncoder.getPostion() //encoder


     }

    //setter methods

    public void setMotorForward() {
        motor.set(MOTOR_SPEED);

     public void setMotorReverse() {
        motor.set(MOTOR_SPEED);
    }
    public void setMotor(double speed);
    motor.setSpeed(speed);
//similar to a while loop, but for while loop motor on
    public void periodic(){
        //constantly print the current angle
        System.out.println(getAngle());


    }


}


