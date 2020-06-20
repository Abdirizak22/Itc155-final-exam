public class equelmethod {

	public boolean equals(People other){

	    boolean result;

	    if((other == null) || (getClass() != other.getClass())){

	        result = false;

	    } // end if

	    else{

	        People otherPeople = (People)other;

	        result = name.equals(other.name) &&  age.equals(other.age);

	    } // end else



	    return result;

	} // end equals





}
