using System.Collections.Generic;
using PSP.labExercises_strategy;
using PSP.labExercises_strategy.Recipes;
using PSP.labExcercises_strategy.Recipes;

namespace PSP.labExcercises_strategy
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Step> pancakeSteps = new List<Step>
            {
                new Step{Definition="Put all ingredients into a bowl", Duration = 2},
                new Step{Definition="Mix ingredients", Duration = 10},
                new Step{Definition="Heat pan", Duration = 5}
            };
            IRecipeSteps pancake = new Pancake(pancakeSteps);

            List<Step> pizzaSteps = new List<Step>
            {
                new Step{Definition="Add tomato sauce", Duration = 2},
                new Step{Definition="Add cheese", Duration = 2},
                new Step{Definition="Add spices", Duration = 2},
                new Step{Definition="Add jelapenos", Duration = 1},
                new Step{Definition="Add salami", Duration = 2},
                new Step{Definition="Heat oven", Duration = 15}
            };
            IRecipeSteps pizza = new Pizza(pizzaSteps);

            List<Step> hPeroxideSteps = new List<Step>
            {
                new Step{Definition="Put all ingredients into a mixing flask", Duration = 2},
                new Step{Definition="Mix ingredients", Duration = 2},
                new Step{Definition="Prepare hydrolizer", Duration = 5}
            };
            IRecipeSteps hydrogenPeroxide = new HydrogenPeroxide(hPeroxideSteps);

            Recipe pancakeRecipe = new Recipe(pancake);
            pancakeRecipe.GetRecipe();

            System.Console.WriteLine("\n\n");

            Recipe pizzaRecipe = new Recipe(pizza);
            pizzaRecipe.GetRecipe();

            System.Console.WriteLine("\n\n");

            Recipe hydrogenPeroxideRecipe = new Recipe(hydrogenPeroxide);
            hydrogenPeroxideRecipe.GetRecipe();
        }
    }
}
