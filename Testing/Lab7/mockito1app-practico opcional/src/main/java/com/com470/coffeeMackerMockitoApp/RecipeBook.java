package com.com470.coffeeMackerMockitoApp;

public interface RecipeBook {
	
	/**
	 * Returns the recipe array.
	 * @param void
	 * @return Recipe[]
	 */
	public Recipe[] getRecipes();
        
        
	/**
	 * Returns true or false if add the recipe.
	 * @param recipe
	 * @return Boolean
	 */
	public boolean addRecipe(Recipe recipe);
	
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
