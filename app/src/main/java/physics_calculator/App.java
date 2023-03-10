/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package physics_calculator;
import physics_calculator.CalculatorFunctions.Calculator;
import physics_calculator.CalculatorFunctions.Units.Directions;
import physics_calculator.CalculatorFunctions.Units.DistanceUnits;
import physics_calculator.CalculatorFunctions.Units.TimeUnits;


public class App {
    public static void main(String[] args) {
        String velocity = Calculator.calculateVelocity(0, 5, 5, Directions.north, DistanceUnits.meters, TimeUnits.second);

        System.out.println(velocity);       // -1 meters/second north
    }
}
