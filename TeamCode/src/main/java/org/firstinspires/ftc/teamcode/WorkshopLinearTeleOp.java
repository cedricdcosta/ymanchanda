package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by Schubert on 9/24/2016.
 */

@TeleOp(name = "WorkshopLinearTeleOp", group ="Workshop")
public class WorkshopLinearTeleOp extends LinearOpMode {
    DcMotor leftMotor;
    DcMotor rightMotor;

    @Override
    public void runOpMode() throws InterruptedException {
        //init
        leftMotor = hardwareMap.dcMotor.get("leftSideMotor");
        rightMotor = hardwareMap.dcMotor.get("rightSideMotor");

        leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();
        //Start


        //Main Loop
        while(opModeIsActive()){
            double left = -gamepad1.left_stick_y;
            double right = -gamepad1.right_stick_y;

            leftMotor.setPower(left);
            rightMotor.setPower(right);


            idle();
        }

        //Stop function go here
    }
}
