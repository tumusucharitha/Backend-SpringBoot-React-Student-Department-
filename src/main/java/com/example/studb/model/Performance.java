package com.example.studb.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="performance")
public class Performance 
{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="attendance")
	private int attendance;
	
	@Column(name="first_year_percent")
	private int first_year_percent;
	
	@Column(name="first_year_backlogs")
	private int first_year_backlogs;
	
	@Column(name="second_year_percent")
	private int second_year_percent;
	
	@Column(name="second_year_backlogs")
	private int second_year_backlogs;
	
	@Column(name="third_year_percent")
	private int third_year_percent;
	
	@Column(name="third_year_backlogs")
	private int third_year_backlogs;
	
	@Column(name="fourth_year_percent")
	private int fourth_year_percent;
	
	@Column(name="fourth_year_backlogs")
	private int fourth_year_backlogs;

	public Performance() {
	}
	
	public Performance(int id, int attendance, int first_year_percent, int first_year_backlogs, int second_year_percent,
			int second_year_backlogs, int third_year_percent, int third_year_backlogs, int fourth_year_percent,
			int fourth_year_backlogs) {
		super();
		this.id = id;
		this.attendance = attendance;
		this.first_year_percent = first_year_percent;
		this.first_year_backlogs = first_year_backlogs;
		this.second_year_percent = second_year_percent;
		this.second_year_backlogs = second_year_backlogs;
		this.third_year_percent = third_year_percent;
		this.third_year_backlogs = third_year_backlogs;
		this.fourth_year_percent = fourth_year_percent;
		this.fourth_year_backlogs = fourth_year_backlogs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	public int getFirst_year_percent() {
		return first_year_percent;
	}

	public void setFirst_year_percent(int first_year_percent) {
		this.first_year_percent = first_year_percent;
	}

	public int getFirst_year_backlogs() {
		return first_year_backlogs;
	}

	public void setFirst_year_backlogs(int first_year_backlogs) {
		this.first_year_backlogs = first_year_backlogs;
	}

	public int getSecond_year_percent() {
		return second_year_percent;
	}

	public void setSecond_year_percent(int second_year_percent) {
		this.second_year_percent = second_year_percent;
	}

	public int getSecond_year_backlogs() {
		return second_year_backlogs;
	}

	public void setSecond_year_backlogs(int second_year_backlogs) {
		this.second_year_backlogs = second_year_backlogs;
	}

	public int getThird_year_percent() {
		return third_year_percent;
	}

	public void setThird_year_percent(int third_year_percent) {
		this.third_year_percent = third_year_percent;
	}

	public int getThird_year_backlogs() {
		return third_year_backlogs;
	}

	public void setThird_year_backlogs(int third_year_backlogs) {
		this.third_year_backlogs = third_year_backlogs;
	}

	public int getFourth_year_percent() {
		return fourth_year_percent;
	}

	public void setFourth_year_percent(int fourth_year_percent) {
		this.fourth_year_percent = fourth_year_percent;
	}

	public int getFourth_year_backlogs() {
		return fourth_year_backlogs;
	}

	public void setFourth_year_backlogs(int fourth_year_backlogs) {
		this.fourth_year_backlogs = fourth_year_backlogs;
	}

	@Override
	public String toString() {
		return "Performance [id=" + id + ", attendance=" + attendance + ", first_year_percent=" + first_year_percent
				+ ", first_year_backlogs=" + first_year_backlogs + ", second_year_percent=" + second_year_percent
				+ ", second_year_backlogs=" + second_year_backlogs + ", third_year_percent=" + third_year_percent
				+ ", third_year_backlogs=" + third_year_backlogs + ", fourth_year_percent=" + fourth_year_percent
				+ ", fourth_year_backlogs=" + fourth_year_backlogs + "]";
	}
	
}
