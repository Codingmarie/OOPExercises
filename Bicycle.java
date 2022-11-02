class Bicycle{
	private String ownerName;
	private String tagNo;
	public Bicycle(){
		ownerName="unknown";
		tagNo="unknown";
	}
	public Bicycle(String name, String tag){
		ownerName = name;
		tagNo = tag;
	}
	public String getOwnerName(){
		return ownerName;
	}
	public void setOwnerName (String name){
		ownerName = name;
	}
	public String getTagNo(){
		return tagNo;
	}
	public void setTagNo (String no){
		tagNo = no;
	}

}

class BicycleRegistration{
	public static void main(String[] args){

		Bicycle bike, bike1, bike2;
		String owner1, owner2;
		String tag1;

		bike1 = new Bicycle();
		bike1.setOwnerName("Adam Smith");


		bike2 = new Bicycle();
		bike2.setOwnerName("Ben Jones");
		
		
		bike = new Bicycle();
		bike.setTagNo("2004-134R");

		
		owner1 = bike1.getOwnerName();
		owner2 = bike2.getOwnerName();
		tag1 = bike.getTagNo();
		
		System.out.println(owner1 + " owns a bicycle.");
		System.out.println(owner2 + " also owns a bicycle,");
		System.out.println(tag1 + " is the Tag No of bicycle 1.");
	}

}












