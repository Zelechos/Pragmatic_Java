package com.com470.coffeeMackerMockitoApp;

public interface RecipeBook {
	
	
	/**
	 * Returns the recipe array.
	 * @param r
	 * @return Recipe[]
	 */
	public Recipe[] getRecipes();
	
	public boolean addRecipe(Recipe r);
	
	/**
	 * Returns the name of the recipe deleted at the position specified
	 * and null if the recipe does not exist.
	 * @param recipeToDelete
	 * @return String
	 */
	public String deleteRecipe(int recipeToDelete); 	
	
	/**
	 * Returns the name of the recipe edited at the position specified
	 * and null if the recipe does not exist.
	 * @param recipeToEdit
	 * @param newRecipe
	 * @return String
	 */
	public String editRecipe(int recipeToEdit, Recipe newRecipe);

}
