package com.civil;

import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class Traininginstitute {
	    @Id  
	    private int Aid;
	    private String Aname;
	    @OneToMany(targetEntity = Branch.class, cascade = CascadeType.ALL)
	    private List<Branch> branches;
		public int getAid() {
			return Aid;
		}
		public void setAid(int aid) {
			Aid = aid;
		}
		public String getAname() {
			return Aname;
		}
		public void setAname(String aname) {
			Aname = aname;
		}
		public List<Branch> getBranches() {
			return branches;
		}
		public void setBranches(List<Branch> branches) {
			this.branches = branches;
		}
		@Override
		public String toString() {
			return "Traininginstitute [Aid=" + Aid + ", Aname=" + Aname + ", branches=" + branches + "]";
		}
		public Traininginstitute(int aid, String aname, List<Branch> branches) {
			super();
			Aid = aid;
			Aname = aname;
			this.branches = branches;
		}
		public Traininginstitute() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
