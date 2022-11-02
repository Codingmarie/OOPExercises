class BicycleRegistration{
	
	public static void main(String[] args){
		Bicycle bike1, bike2;
		String owner1, owner2;
		
		bike1 = new Bicycle();//Create and assign values to bike1
		bike1.setOwnerName("Adam Smith");
		
		bike2 = new Bicycle();//Create and assign values to bike2
		bike2.setOwnerName("Ben Jones");
		
		//Output the information
		owner1 = bike1.getOwnerName();
		owner2 = bike2.getOwnerName();
		 
		System.out.println(owner1+"own's a bicycle");
		System.out.println(owner2+"also own's a bicycle"); 
		
	}
}

class Bicycle{
	//Data Member
	private String ownerName;
	//Constructor: Initializes the data member
	public Bicycle(){
		ownerName = "Unknown";
	} 
	//Returns the name of this bicycle's owner
	public String getOwnerName(){
		return ownerName;
	} 
	//Assign the name of this bicycle's owner
	public void setOwnerName(String name){

		ownerName = name;
	}
}
