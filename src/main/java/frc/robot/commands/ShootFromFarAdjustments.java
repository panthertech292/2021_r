// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants.ShooterConstants;
import frc.robot.subsystems.BeltSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.subsystems.DriveSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ShootFromFarAdjustments extends SequentialCommandGroup {
  private final ShooterSubsystem ShooterSubsystem;
  private final BeltSubsystem BeltSubsystem;
  private final DriveSubsystem DriveSubsystem;
  public ShootFromFarAdjustments(ShooterSubsystem s_ShooterSubsystem, BeltSubsystem s_BeltSubsystem, DriveSubsystem s_DriveSubsystem) {
    ShooterSubsystem = s_ShooterSubsystem;
    BeltSubsystem = s_BeltSubsystem;
    DriveSubsystem = s_DriveSubsystem;
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
    new ShootFromFarAim(s_ShooterSubsystem, s_BeltSubsystem, s_DriveSubsystem),
    new ShootFromFarFire(s_ShooterSubsystem, s_BeltSubsystem, s_DriveSubsystem)

    );
  }
}
