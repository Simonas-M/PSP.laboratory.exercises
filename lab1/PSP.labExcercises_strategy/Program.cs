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

            List<Step> pizzaSteps = new List<Step>
            {
                new Step{Definition="Add tomato sauce", Duration = 2, Cost = 0.59M},
                new Step{Definition="Add cheese", Duration = 2, Cost = 1.21M},
                new Step{Definition="Add spices", Duration = 2, Cost = 0.58M},
                new Step{Definition="Add jelapenos", Duration = 1, Cost = 0.98M},
                new Step{Definition="Add salami", Duration = 2, Cost = 2.33M},
                new Step{Definition="Heat oven", Duration = 15, Cost = 0.22M}
            };

            List<Step> cupcakeSteps = new List<Step>
            {
                new Step{Definition="Add flour", Duration = 2, Cost = 0.1M},
                new Step{Definition="Add eggs", Duration = 2, Cost = 0.25M},
                new Step{Definition="Add butter", Duration = 2, Cost = 0.24M},
                new Step{Definition="Add milk", Duration = 1, Cost = 0.46M},
                new Step{Definition="Mix ingredients", Duration = 2, Cost = 0.1M},
                new Step{Definition="Heat oven", Duration = 15, Cost = 0.22M}
            };

            Recipe pancakeRecipeF = new Recipe(new Pancake(), new FastFoodPrice(), pancakeSteps);
            pancakeRecipeF.GetRecipe();
            pancakeRecipeF.GetPrice();
            System.Console.WriteLine("\n\n");
            Recipe pancakeRecipeR = new Recipe(new Pancake(), new RestaurantPrice(), pancakeSteps);
            pancakeRecipeR.GetRecipe();
            pancakeRecipeR.GetPrice();

            System.Console.WriteLine("\n\n");

            Recipe pizzaRecipeF = new Recipe(new Pizza(), new FastFoodPrice(), pizzaSteps);
            pizzaRecipeF.GetRecipe();
            pizzaRecipeF.GetPrice();
            System.Console.WriteLine("\n\n");
            Recipe pizzaRecipeR = new Recipe(new Pizza(), new RestaurantPrice(), pizzaSteps);
            pizzaRecipeR.GetRecipe();
            pizzaRecipeR.GetPrice();

            System.Console.WriteLine("\n\n");

            Recipe cupcakeRecipeF = new Recipe(new Pizza(), new FastFoodPrice(), cupcakeSteps);
            cupcakeRecipeF.GetRecipe();
            cupcakeRecipeF.GetPrice();
            System.Console.WriteLine("\n\n");
            Recipe cupcakeRecipeR = new Recipe(new Pizza(), new RestaurantPrice(), cupcakeSteps);
            cupcakeRecipeR.GetRecipe();
            cupcakeRecipeR.GetPrice();
        }
    }
}
