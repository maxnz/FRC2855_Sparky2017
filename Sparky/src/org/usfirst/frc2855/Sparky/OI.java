// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2855.Sparky;

import org.usfirst.frc2855.Sparky.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc2855.Sparky.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    public JoystickButton joystickButton1;
    public JoystickButton joystickButton3;
    public JoystickButton i2cstart;
    public Joystick joystick1;
    public JoystickButton joystickButton2;
    public JoystickButton joystickButton4;
    public JoystickButton joystickButton5;
    public Joystick joystick2;

    public OI() {

        joystick2 = new Joystick(1);
        joystick1 = new Joystick(0);
        
        joystickButton5 = new JoystickButton(joystick2, 1);
        joystickButton5.whileHeld(new GearOut());
        joystickButton4 = new JoystickButton(joystick2, 2);
        joystickButton4.whileHeld(new GearIn());
        joystickButton2 = new JoystickButton(joystick1, 1);
        joystickButton2.whileHeld(new GearUnpinch());
        
        joystickButton3 = new JoystickButton(joystick1, 4);
        joystickButton3.whileHeld(new Shooter());
        joystickButton1 = new JoystickButton(joystick1, 2);
        joystickButton1.whileHeld(new GearPinch());
        


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousDriveCommandGroup());
        SmartDashboard.putData("Drive Robot", new DriveRobot());
        SmartDashboard.putData("Gear Pinch", new GearPinch());
        SmartDashboard.putData("Gear Unpinch", new GearUnpinch());
        SmartDashboard.putData("Shooter", new Shooter());
        SmartDashboard.putData("Gear In", new GearIn());
        SmartDashboard.putData("Gear Out", new GearOut());
        SmartDashboard.putNumber("ShooterSpeed", 0);
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick1() {
        return joystick1;
    }

    public Joystick getJoystick2() {
        return joystick2;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

