public class Animal{

	private String animalType;
	private double weight;
	private double price;

	public Animal(){}

	public Animal(String animalType, double weight, double price){
		this.animalType = animalType;
		this.weight = weight;
		this.price = price;

	}

	public void setAnimalType(String animalType){
		this.animalType = animalType;

	}

	public String getAnimalType(){
		return animalType;
	}

	public void setWeight(double weight){
		this.weight = weight;

	}

	public double getWeight(){
		return weight;
	}

	public void setPrice(double price){
		this.price = price;

	}

	public double getPrice(){
		return price;
	}

	  public String toString(){
        return "[" + animalType + "," + weight + ","+price+ "]";
    }
    
}