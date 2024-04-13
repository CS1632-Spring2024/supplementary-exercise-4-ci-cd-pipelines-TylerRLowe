package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	int id = 0;
	String name = "";
	boolean rented = false;

	public CatImpl(int id, String name) {
		// TODO: Fill in
		this.name = name;
		this.id = id;


	}

	/**
	 * Rent cat. Simply sets the _rented flag to true.
	 */
	public void rentCat() {
		this.rented = true;
		
		// TODO: Fill in
	}

	/**
	 * Return cat. Simply sets the _rented flag to false.
	 */
	public void returnCat() {
		this.rented = false;
		// TODO: Fill in
	}

	/**
	 * Rename cat. Simply sets the name to the new name.
	 * 
	 * @param String name New name of the cat
	 */
	public void renameCat(String name) {
		this.name = name;
		// TODO: Fill in
	}

	/**
	 * Accessor for _name variable. Returns the name of this cat.
	 * 
	 * @return String name of cat
	 */

	public String getName() {

		// TODO: Fill in
		return this.name;
	}

	/**
	 * Accessor for _id variable. Returns the ID of this cat.
	 * 
	 * @return int ID of this cat
	 */

	public int getId() {
		// TODO: Fill in
		return this.id;
	}

	/**
	 * Accessor for _rented variable. Returns if cat is rented.
	 * 
	 * @return boolean - true if rented, false otherwise
	 */

	public boolean getRented() {
		// TODO: Fill in
		return this.rented;
	}

	/**
	 * Returns string version of this cat, in form: "ID *id_num*. *name*" Example
	 * for cat of ID 1, name Jennyanydots: "ID 1. Jennyanydots"
	 * 
	 * @return String string version of cat
	 */

	public String toString() {
		// TODO: Fill in
		return "ID " + this.id + ". " + this.name;
	}

}