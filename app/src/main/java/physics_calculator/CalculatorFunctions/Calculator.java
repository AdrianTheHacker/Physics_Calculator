package physics_calculator.CalculatorFunctions;

import physics_calculator.CalculatorFunctions.Units.DistanceUnits;
import physics_calculator.CalculatorFunctions.Units.TimeUnits;
import physics_calculator.CalculatorFunctions.Units.Directions;

import java.text.MessageFormat;


public class Calculator {
    public static String calculateVelocity(int startPosition, int endPosition, int timeTaken, Directions direction, DistanceUnits distanceUnits, TimeUnits timeUnits) {
        int changeInPosition = startPosition - endPosition;
        float velocity = changeInPosition / timeTaken;

        return MessageFormat.format("{0} {1}/{2} {3}", velocity, distanceUnits, timeUnits, direction);
    }
}
