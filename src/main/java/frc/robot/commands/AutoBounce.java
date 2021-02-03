/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DriveSubsystem;
// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class AutoBounce extends SequentialCommandGroup {
  /**
   * Creates a new AutoBounce.
   */
  private final DriveSubsystem DriveSubsystem;
  public AutoBounce(DriveSubsystem s_DriveSubsystem) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
   // super();
   DriveSubsystem = s_DriveSubsystem;

   addRequirements(s_DriveSubsystem);

   addCommands(
    //new AutoForwardEncoder(s_DriveSubsystem, 48.0, 0.5, 0.5),

    new AutoForwardPID(s_DriveSubsystem, 5.0, 0.5)

    //new AutoBackwardEncoder(s_DriveSubsystem, 48.0, 0.5, 0.5),

    //new AutoForward(s_DriveSubsystem, 1.0, 0.0, 0.0)

   );
  }
}
