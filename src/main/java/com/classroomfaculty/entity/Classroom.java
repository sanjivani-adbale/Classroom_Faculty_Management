package com.classroomfaculty.entity;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


	@Entity
	public class Classroom {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;

		@Column(nullable = false)
		private String name;
		
		// Constructors, getters, and setters
		
		public Classroom() {
			// TODO Auto-generated constructor stub
		}

		public Classroom(long i, String name) {
			super();
			this.id = i;
			this.name = name;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Classroom [id=" + id + ", name=" + name + "]";
		}

		
		
	}




