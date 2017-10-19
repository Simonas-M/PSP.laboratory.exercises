using PSP.labExercises_template.Recipes;
using System.Collections.Generic;

namespace PSP.labExercises_template
{
    public class Program
    {
        public static void Main(string[] args)
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

            Recipe pancakeFastFood = new PancakeFastFood(pancakeSteps);
            pancakeFastFood.GetRecipe();

            System.Console.WriteLine("\n\n");

            Recipe pancakeRestaurant = new PancakeRestaurant(pancakeSteps);
            pancakeRestaurant.GetRecipe();

            System.Console.WriteLine("\n\n");

            Recipe pizzaFastFood = new PizzaFastFood(pizzaSteps);
            pizzaFastFood.GetRecipe();

            System.Console.WriteLine("\n\n");

            Recipe pizzaRestaurant = new PizzaRestaurant(pizzaSteps);
            pizzaRestaurant.GetRecipe();

            System.Console.WriteLine("\n\n");

            Recipe cupcakeFastFood = new CupcakeFastFood(cupcakeSteps);
            cupcakeFastFood.GetRecipe();

            System.Console.WriteLine("\n\n");

            Recipe cupcakeRestaurant = new CupcakeRestaurant(cupcakeSteps);
            cupcakeRestaurant.GetRecipe();
        }
    }
}