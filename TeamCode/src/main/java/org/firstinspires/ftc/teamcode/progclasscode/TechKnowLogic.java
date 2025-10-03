package org.firstinspires.ftc.teamcode.progclasscode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TechKnowLogic extends OpMode {

    @Override
    public void init() {
        int x = 15000;
        int y = 4;
        String teamName = "TechKNOWLogic";
        int teamNumber = x + y;

//        Telemetry.addData( "Team Name", teamName);
        telemetry.addData( "Team Name", teamName);
        telemetry.addData( "Team number", teamNumber);
    }

    @Override
    public void loop() {

    }
}
