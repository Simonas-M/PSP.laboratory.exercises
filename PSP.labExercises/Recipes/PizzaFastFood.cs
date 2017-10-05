using System;
using System.Collections.Generic;
using System.Linq;

namespace PSP.labExercises_template.Recipes
{
    class PizzaFastFood : Recipe
    {
        private FastFoodPriceCalculator _priceCalculator = new FastFoodPriceCalculator();
        public PizzaFastFood(IEnumerable<Step> steps) : base(steps) { }

        protected override void Finally()
        {
            Console.WriteLine("Cooking pizza in the oven");
        }

        protected override void Execute(Step step)
        {
            Console.WriteLine($"Do \"{step.Definition}\" the Italian way for {step.Duration} minutes");
        }

        protected override void PrepareIngredients()
        {
            Console.WriteLine("Get Mozzarela");
            Console.WriteLine("Get Tomato sauce");
            Console.WriteLine("Get Jelapeno");
            Console.WriteLine("Get pizza daugh");
        }

        protected override void GetPrice()
        {
            _priceCalculator.GetPrice(Steps);
        }
    }
}
