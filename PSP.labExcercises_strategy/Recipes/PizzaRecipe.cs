using System;
using System.Collections.Generic;
using PSP.labExercises_strategy;

namespace PSP.labExcercises_strategy.Recipes
{
    class PizzaRecipe : IRecipe
    {
        private List<Step> Steps;

        public PizzaRecipe(List<Step> steps)
        {
            Steps = steps;
        }

        public void MakeFood()
        {
            PrepareIngredients();
            foreach (var step in Steps)
            {
                Execute(step);
            }
            Cook();
        }

        private void Cook()
        {
            Console.WriteLine("Cooking pizza in the oven");
        }

        private void Execute(Step step)
        {
            Console.WriteLine($"Doing: {step.Definition} the Italian way for {step.Duration} minutes");
        }

        private void PrepareIngredients()
        {
            Console.WriteLine("Get Mozzarela");
            Console.WriteLine("Get Tomato sauce");
            Console.WriteLine("Get jelapeno");
            Console.WriteLine("Get pizza daugh");
        }
    }
}