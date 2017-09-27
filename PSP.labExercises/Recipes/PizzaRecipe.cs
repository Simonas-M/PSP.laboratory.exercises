using System;
using System.Collections.Generic;

namespace PSP.labExercises_template.Recipes
{
    class PizzaRecipe : Recipe
    {
        public PizzaRecipe(List<Step> steps) : base(steps) { }

        protected override void Cook()
        {
            Console.WriteLine("Cooking pizza in the oven");
        }

        protected override void Execute(Step step)
        {
            Console.WriteLine($"Doing: {step.Definition} the Italian way for {step.Duration} minutes");
        }

        protected override void PrepareIngredients()
        {
            Console.WriteLine("Get Mozzarela");
            Console.WriteLine("Get Tomato sauce");
            Console.WriteLine("Get jelapeno");
            Console.WriteLine("Get pizza daugh");
        }
    }
}
