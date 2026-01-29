package com.example.StudentForm.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String name;
 private int age;
 private String place;
 public Long getId() {
	return id;
 }
 public void setId(Long id) {
	this.id = id;
 }
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public int getAge() {
	return age;
 }
 public void setAge(int age) {
	this.age = age;
 }
 public String getPlace() {
	return place;
 }
 public void setPlace(String place) {
	this.place = place;
 }
}