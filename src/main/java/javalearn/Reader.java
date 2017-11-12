package javalearn;

public class Reader {
	
	public Reader(Learner learner){
		this.learner=learner;
	}
	
	public Learner getLearner() {
		return learner;
	}
	public void setLearner(Learner learner) {
		this.learner = learner;
	}
	Learner learner;
	public void showAllInConsole(){
		
	}

}
