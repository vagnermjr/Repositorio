package com.novaxs.pokemon.database;

import java.util.ArrayList;
import java.util.Collection;

public class Pokemon {

	private String num;

	private String name;

	private Collection<String> type;

	private Collection<Pokemon> prev_evolution;

	private Collection<Pokemon> next_evolution;

	public Pokemon() {
	}

	public Pokemon(String num, String name, Collection<String> type) {
		this.num = num;
		this.name = name;
		this.type = type;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<String> getType() {
		return type;
	}

	public void setType(Collection<String> type) {
		this.type = type;
	}

	public void addType(String type) {
		if (getType() == null) setType(new ArrayList<String>());
		getType().add(type);
	}

	public Collection<Pokemon> getPrev_evolution() {
		return prev_evolution;
	}

	public void setPrev_evolution(Collection<Pokemon> prev_evolution) {
		this.prev_evolution = prev_evolution;
	}

	public Collection<Pokemon> getNext_evolution() {
		return next_evolution;
	}

	public void setNext_evolution(Collection<Pokemon> next_evolution) {
		this.next_evolution = next_evolution;
	}

}
