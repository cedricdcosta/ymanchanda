package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorImpl;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by Schubert on 9/24/2016.
 */

public class WorkshopRobot {
    public DcMotor leftMotor;
    public DcMotor rightMotor;

    public ElapsedTime runtime;

    public void setupHardware(HardwareMap hardwareMap){
        leftMotor = hardwareMap.dcMotor.get("leftSideMotor");
        rightMotor = hardwareMap.dcMotor.get("rightSideMotor");

        leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        runtime = new ElapsedTime();
    }
}
