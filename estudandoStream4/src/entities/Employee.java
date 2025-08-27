package entities;

import java.util.Objects;

public class Employee {
	
	private String name;
	private String email;
	private Double Salary;
	
	public Employee() {
	}

	public Employee(String name, String email, Double salary) {
		this.name = name;
		this.email = email;
		Salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Salary, email, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Salary, other.Salary) && Objects.equals(email, other.email)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", Salary=" + Salary + "]";
	}
}
