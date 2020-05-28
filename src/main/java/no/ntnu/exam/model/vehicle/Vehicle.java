package no.ntnu.exam.model.vehicle;

import no.ntnu.exam.model.Payable;

/**
 * Class representing a vehicle. Holds information used to identify and register a vehicles
 * passage through a toll station.
 * @author 10033
 * @version 0.1
 */

public abstract class Vehicle implements Payable {

  protected String registrationNumber;
  protected int weight;

  public Vehicle(String regNumber, int weight) {
    if ( regNumber != null && !regNumber.trim().equals("")) {
      this.registrationNumber = regNumber;
    } else {
      throw new IllegalArgumentException("Invalid liscence registration number.");
    }
    this.weight = weight;
  }

  /**
   * Returns the registered weight of this vehicle.
   * @return the registered weight of this vehicle.
   */
  public int getWeight() {
    return weight;
  }

  public String getLisencePlateNumber() {
    return registrationNumber;
  }

}

