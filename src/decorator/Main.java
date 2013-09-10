package decorator;

	public class Main {
		 
	    public static final void main(String[] args) {
	        Coffee c = new Cappucino();
	        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
	 
	        c = new Milk(c);
	        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
	 
	        c = new Sprinkles(c);
	        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
	 
	        c = new Whip(c);
	        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
	 
	        c = new Sprinkles(c);
	        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
	    }
	 
	}
