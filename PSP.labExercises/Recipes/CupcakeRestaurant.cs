using System;
using System.Collections.Generic;
using System.Linq;

namespace PSP.labExercises_template.Recipes
{
    class CupcakeRestaurant : Recipe
    {
        private RestaurantPriceCalculator _priceCalculator = new RestaurantPriceCalculator();
        public CupcakeRestaurant(IEnumerable<Step> steps) : base(steps) { }

        protected override void Finally()
        {
            Console.WriteLine("Bake cupcakes in the oven until brown");
        }

        protected override void Execute(Step step)
        {
            Console.WriteLine($"Do \"{step.Definition}\" the Swedish way for {step.Duration} minutes");
        }

        protected override void PrepareIngredients()
        {
            Console.WriteLine("Get the flour");
            Console.WriteLine("Get the eggs");
            Console.WriteLine("Get the butter");
            Console.WriteLine("Get the milk");
            Console.WriteLine("Get the pan");
        }

        protected override void GetPrice()
        {
            _priceCalculator.GetPrice(Steps);
        }
    }
}
