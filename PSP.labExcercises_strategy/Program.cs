using System.Collections.Generic;
using PSP.labExercises_strategy;
using PSP.labExercises_strategy.Recipes;
using PSP.labExcercises_strategy.Recipes;
using PSP.labExcercises_strategy.Price_policies;

namespace PSP.labExcercises_strategy
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Step> pancakeSteps = new List<Step>
            {
                new Step{Definition="Put all ingredients into a bowl", Duration = 2, Cost = 2.33M},
                new Step{Definition="Mix ingredients", Duration = 10, Cost = 1.25M},
                new Step{Definition="Heat pan", Duration = 5, Cost = 0.5M}
            };
            IRecipeDetails pancakeRestaurant = new Pancake(pancakeSteps, new RestaurantPrice());
            IRecipeDetails pancakeFastFood = new Pancake(pancakeSteps, new FastFoodPrice());

            List<Step> pizzaSteps = new List<Step>
            {
                new Step{Definition="Add tomato sauce", Duration = 2, Cost = 0.59M},
                new Step{Definition="Add cheese", Duration = 2, Cost = 1.21M},
                new Step{Definition="Add spices", Duration = 2, Cost = 0.58M},
                new Step{Definition="Add jelapenos", Duration = 1, Cost = 0.98M},
                new Step{Definition="Add salami", Duration = 2, Cost = 2.33M},
                new Step{Definition="Heat oven", Duration = 15, Cost = 0.22M}
            };
            IRecipeDetails pizzaRestaurant = new Pizza(pizzaSteps, new RestaurantPrice());
            IRecipeDetails pizzaFastFood = new Pizza(pizzaSteps, new FastFoodPrice());

            Recipe pancakeRecipeF = new Recipe(pancakeFastFood);
            pancakeRecipeF.GetRecipe();
            System.Console.WriteLine("\n\n");
            Recipe pancakeRecipeR = new Recipe(pancakeRestaurant);
            pancakeRecipeR.GetRecipe();

            System.Console.WriteLine("\n\n");

            Recipe pizzaRecipeF = new Recipe(pizzaFastFood);
            pizzaRecipeF.GetRecipe();
            System.Console.WriteLine("\n\n");
            Recipe pizzaRecipeR = new Recipe(pizzaRestaurant);
            pizzaRecipeR.GetRecipe();
        }
    }
}
