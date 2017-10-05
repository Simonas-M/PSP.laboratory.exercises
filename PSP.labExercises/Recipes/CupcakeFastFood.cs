using System;
using System.Collections.Generic;
using System.Linq;

namespace PSP.labExercises_template.Recipes
{
    class CupcakeFastFood : Recipe
    {
        public CupcakeFastFood(IEnumerable<Step> steps) : base(steps) { }

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
            ProductPriceCalculator.GetProductPrice(Steps, "Fast Food");
        }
    }
}
