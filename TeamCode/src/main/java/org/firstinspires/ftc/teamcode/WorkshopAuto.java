package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by Schubert on 9/24/2016.
 */

@Autonomous(name = "WorkShopAuto", group = "Workshop")
public class WorkshopAuto extends OpMode {
    WorkshopRobot robot;

    @Override
    public void init() {
        robot = new WorkshopRobot();
        robot.setupHardware(hardwareMap);
    }

    @Override
    public void start(){
        robot.runtime.reset();
    }

    @Override
    public void loop() {
        if(robot.runtime.seconds() < 5){
            robot.leftMotor.setPower(1);
            robot.rightMotor.setPower(1);
        }
        else if( robot.runtime.seconds() < 10){
            robot.leftMotor.setPower(-1);
            robot.rightMotor.setPower(1);
        }
        else if ( robot.runtime.seconds() < 15){
            robot.leftMotor.setPower(1);
            robot.rightMotor.setPower(1);
        }
        else{
            robot.leftMotor.setPower(0);
            robot.rightMotor.setPower(0);
        }
    }
}
