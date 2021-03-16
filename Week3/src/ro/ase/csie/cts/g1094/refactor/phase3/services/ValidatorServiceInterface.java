package ro.ase.csie.cts.g1094.refactor.phase3.services;

import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidAgeExceptions;
import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidPriceException;

public interface ValidatorServiceInterface {
	
	public void validatePrice(float price) throws InvalidPriceException;
	public void validateAge(int accountAge) throws InvalidAgeExceptions;

}
