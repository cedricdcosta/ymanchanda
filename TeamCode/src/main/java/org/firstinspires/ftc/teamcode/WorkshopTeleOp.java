package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by Schubert on 9/24/2016.
 */

@TeleOp(name = "WorkShopTeleOp", group = "Workshop")
public class WorkshopTeleOp extends OpMode {

    WorkshopRobot robot;

    @Override
    public void init(){
        robot = new WorkshopRobot();
        robot.setupHardware(hardwareMap);
    }

    @Override
    public void start(){
        robot.runtime.reset();
    }

    @Override
    public void loop(){
        telemetry.addData("Time", "Runtime: " + robot.runtime.toString() );

        double left = -gamepad1.left_stick_y;
        double right = -gamepad1.right_stick_y;


        telemetry.addData("JoyStick", "ly: " + left);
        telemetry.addData("JoyStick", "ry: " + right);

        robot.leftMotor.setPower(left);
        robot.rightMotor.setPower(right);


    }
}
