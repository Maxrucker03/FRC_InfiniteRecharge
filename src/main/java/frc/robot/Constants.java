/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    // TODO: General constants

    // TODO: Intake

    // TODO: Storage

    // TODO: Shooter
    public final class Shooter {
        public static final int CANID_FLYWHEEL1=10;
        public static final int CANID_FLYWHEEL2=11;
        public static final int CANID_TURRET=14;
        public static final int CANID_HOOD=13;
    }

    // TODO: Hang
    public final class Hang{ 
        public static final int CANID_WINCH=20;
    }
    
    // TODO: Control Panel (wheel)
    
    // TODO: Vision

    // TODO: Drive
    public final class Drive {
        public static final int CANID_LEFT1 = 1;  // For example
        public static final int CANID_LEFT2 = 2;
        public static final int CANID_RIGHT1 = 10;
        public static final int CANID_RIGHT2 = 11;
    }
}
