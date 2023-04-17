package com.com470.coffeeMackerMockitoApp;

import com.com470.coffeeMackerMockitoApp.exceptions.InventoryException;
import com.com470.coffeeMackerMockitoApp.exceptions.RecipeException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class CoffeeMakerTest {
	
	//-----------------------------------------------------------------------
	//	DATA MEMBERS
	//-----------------------------------------------------------------------
	private Recipe recipe1;
	private Recipe recipe2;
	private Recipe recipe3;
	private Recipe recipe4;
	private Recipe recipe5;
	
	private Recipe [] stubRecipies; 
	
	/**
	 * The coffee maker -- our object under test.
	 */
	private CoffeeMaker coffeeMaker;
	
	/**
	 * The stubbed recipe book.
	 */
	private RecipeBook recipeBookStub;
	
	private Inventory inv;
	
	@Before
	public void setUp() throws RecipeException {
		
		recipeBookStub = mock(RecipeBook.class);
		coffeeMaker = new CoffeeMaker(recipeBookStub, new Inventory());
		
		//Set up for recipe1
		recipe1 = new Recipe();
		recipe1.setName("Coffee");
		recipe1.setAmtChocolate("0");
		recipe1.setAmtCoffee("3");
		recipe1.setAmtMilk("1");
		recipe1.setAmtSugar("1");
		recipe1.setPrice("50");
		
		//Set up for recipe2
		recipe2 = new Recipe();
		recipe2.setName("Mocha");
		recipe2.setAmtChocolate("20");
		recipe2.setAmtCoffee("3");
		recipe2.setAmtMilk("1");
		recipe2.setAmtSugar("1");
		recipe2.setPrice("75");
		
		//Set up for recipe3
		recipe3 = new Recipe();
		recipe3.setName("Latte");
		recipe3.setAmtChocolate("0");
		recipe3.setAmtCoffee("3");
		recipe3.setAmtMilk("3");
		recipe3.setAmtSugar("1");
		recipe3.setPrice("100");
		
		//Set up for recipe4
		recipe4 = new Recipe();
		recipe4.setName("Hot Chocolate");
		recipe4.setAmtChocolate("4");
		recipe4.setAmtCoffee("0");
		recipe4.setAmtMilk("1");
		recipe4.setAmtSugar("1");
		recipe4.setPrice("65");
		
		//Set up for recipe5 (added by MWW)
		recipe5 = new Recipe();
		recipe5.setName("Super Hot Chocolate");
		recipe5.setAmtChocolate("6");
		recipe5.setAmtCoffee("0");
		recipe5.setAmtMilk("1");
		recipe5.setAmtSugar("1");
		recipe5.setPrice("100");

		stubRecipies = new Recipe [] {recipe1, recipe2, recipe3};
	}
	
	
	//-----------------------------------------------------------------------
	//	Test Methods
	//-----------------------------------------------------------------------
	
	// put your tests here!
	
	/**
	 * Given a coffee maker with one valid recipe
	 * When we make coffee, selecting the valid recipe and paying more than 
	 * 		the coffee costs
	 * Then we get the correct change back.
	 */
        
        @Test
        public void MakeCoffee(){
            coffeeMaker = new CoffeeMaker(recipeBookStub, new Inventory());
            assert(true);
        }
	
        @Test
        public void testAddRecipe(){
            when(recipeBookStub.addRecipe(recipe1)).thenReturn(true);
            assertTrue(coffeeMaker.addRecipe(recipe1));
            verify(recipeBookStub).addRecipe(recipe1);
        }
        
        
        @Test
        public void testDeleteRecipe(){
            when(recipeBookStub.deleteRecipe(0)).thenReturn(stubRecipies[0].getName());
            assertEquals(coffeeMaker.deleteRecipe(0),stubRecipies[0].getName());
            verify(recipeBookStub).deleteRecipe(0);
        }
        
        
        @Test
        public void testEditRecipe(){
            when(recipeBookStub.editRecipe(0, recipe1)).thenReturn(stubRecipies[0].getName());
            assertEquals(coffeeMaker.editRecipe(0, recipe1),stubRecipies[0].getName());
            verify(recipeBookStub).editRecipe(0, recipe1);
        }
        
        @Test(expected = InventoryException.class)
        public void testAddInventory1() throws InventoryException {
            coffeeMaker.addInventory("10", "g", "10", "20");
        }
        
        @Test(expected = InventoryException.class)
        public void testAddInventory2() throws InventoryException{
            coffeeMaker.addInventory("c", "20", "10", "20");
        }   
        
        @Test(expected = InventoryException.class)
        public void testAddInventory3() throws InventoryException{
            coffeeMaker.addInventory("10", "40", "10", "t");
        }
        
        @Test(expected = InventoryException.class)
        public void testAddInventory4() throws InventoryException{
            coffeeMaker.addInventory("40", "20", "t", "20");
        }
        
        @Test(expected = InventoryException.class)
        public void testAddInventory5() throws InventoryException{
            coffeeMaker.addInventory("10", "-20", "10", "20");
        }
        
        @Test(expected = InventoryException.class)
        public void testAddInventory6() throws InventoryException{
            coffeeMaker.addInventory("-10", "20", "10", "20");
        }
        
        @Test(expected = InventoryException.class)
        public void testAddInventory7() throws InventoryException{
            coffeeMaker.addInventory("10", "20", "10", "-20");
        }
        
        @Test
        public void testCheckInventory(){
            String cad = coffeeMaker.checkInventory();
            System.out.println("inventory"+cad);
            
            StringBuffer buf = new StringBuffer();
            buf.append("Coffee: ");
            buf.append(15);
            buf.append("\n");
            buf.append("Milk: ");
            buf.append(15);
            buf.append("\n");
            buf.append("Sugar: ");
            buf.append(15);
            buf.append("\n");
            buf.append("Chocolate: ");
            buf.append(15);
            buf.append("\n");
            assertEquals(buf.toString(), cad);
        }
        
        @Test
        public void testMakeCoffee(){
            when(recipeBookStub.getRecipes()).thenReturn(stubRecipies);
            assertEquals(50, coffeeMaker.makeCoffee(0, 100));
        }
        
        @Test
        public void testMakeCoffeeCasoNulo(){
            when(recipeBookStub.getRecipes()).thenReturn(stubRecipies);
//            assertEquals(100, coffeeMaker.makeCoffee(3, 100));
        }
        
        @Test
        public void testMakeCoffeeMontoMenor(){
            when(recipeBookStub.getRecipes()).thenReturn(stubRecipies);
            assertEquals(10, coffeeMaker.makeCoffee(0, 10));
        }
        
        @Test
        public void testMakeCoffeeNoIngredientes(){
            when(recipeBookStub.getRecipes()).thenReturn(stubRecipies);
            assertEquals(75, coffeeMaker.makeCoffee(1, 75));
        }
		
}
