/* NAME: Janan Jahed
 * DATE: 16th of September 
 * PURPOSE: Student class 
 */


public class Student {
	//Initializing variables 
	public String studentName;
	public String studentMom;
	public String studentDad;
	public String studentGmail;
	public String studentAdvisor;
	public int studentID;
	public int studentGrad;
	public int studentNum;
	
	//Initializing the constructor 
	Student(String sN,String sM,String sD,String sG,String sA,int sID,int Sgr,int sNu){
		this.studentName=sN;
		this.studentMom=sM;
		this.studentDad=sD;
		this.studentGmail=sG;
		this.studentAdvisor=sA;
		this.studentID=sID;
		this.studentGrad=Sgr;
		this.studentNum=sNu;
		
	}
	//initializing methods 
	
	public String StudName() {
		return this.studentName;
	}
	public String StudMom() {
		return this.studentMom;
	}
	public String StudDad() {
		return this.studentDad;
	}
	public String StudGm() {
		return this.studentGmail;
	}
	public String StudAd() {
		return this.studentAdvisor; 
	}
	
	public int studID(){
		return this.studentID;
	}
	
	public int studGrad(){
		return this.studentGrad;
	}
	public int studNum(){
		return this.studentNum;
	}

	public String getStudentName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
