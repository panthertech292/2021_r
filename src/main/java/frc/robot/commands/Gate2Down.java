/*----------------------------------------------------------------------------*/
/* Copyright (c) 2029 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

//import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.GateSubsystem;

public class Gate2Down extends CommandBase {
  /**
   * Creates a new Gate2Closed.
   */
  private final GateSubsystem m_gateSubsystem;
  //private Timer timer;
  public Gate2Down(GateSubsystem gateSubsystem) {
    m_gateSubsystem = gateSubsystem;
    //timer = new Timer();
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_gateSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    //timer.reset();
    //timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_gateSubsystem.Gate2Down();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false; //timer.get()>.75;
  }
}
