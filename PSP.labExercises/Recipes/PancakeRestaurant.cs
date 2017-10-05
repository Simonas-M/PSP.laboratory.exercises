using System;
using System.Collections.Generic;
using System.Linq;

namespace PSP.labExercises_template.Recipes
{
    class PancakeRestaurant : Recipe
    {
        public PancakeRestaurant(IEnumerable<Step> steps) : base(steps) { }

        private void AddButter(int grams)
        {
            Console.WriteLine($"Add {grams} grams of butter into the pan");
        }

        protected override void Finally()
        {
            AddButter(100);
            Console.WriteLine("Cook pancakes in the pan");
        }

        protected override void Execute(Step step)
        {
            Console.WriteLine($"Do \"{step.Definition}\" the Lithuanian way for {step.Duration} minutes");
        }

        protected override void PrepareIngredients()
        {
            Console.WriteLine("Get the eggs");
            Console.WriteLine("Get the milk");
            Console.WriteLine("Get the flour");
            Console.WriteLine("Get the butter");
        }

        protected override void GetPrice()
        {
            ProductPriceCalculator.GetProductPrice(Steps, "Restaurant");
        }
    }
}
