using PSP.labExercises_strategy;
using System;
using System.Collections.Generic;

namespace PSP.labExcercises_strategy.Recipes
{
    class Cupcake : IRecipeDetails
    {
        private IEnumerable<Step> _steps;
        private IPricePolicy _pricePolicy;

        public Cupcake(List<Step> steps, IPricePolicy pricePolicy)
        {
            _steps = steps;
            _pricePolicy = pricePolicy;
        }

        public IEnumerable<Step> GetSteps()
        {
            return _steps;
        }

        public void Finally()
        {
            Console.WriteLine("Bake cupcakes in the oven until brown");
        }

        public void Execute(Step step)
        {
            Console.WriteLine($"Do \"{step.Definition}\" the Swedish way for {step.Duration} minutes");
        }

        public void PrepareIngredients()
        {
            Console.WriteLine("Get the flour");
            Console.WriteLine("Get the eggs");
            Console.WriteLine("Get the butter");
            Console.WriteLine("Get the milk");
            Console.WriteLine("Get the pan");
        }

        public void GetPrice()
        {
            _pricePolicy.GetPrice(GetSteps());
        }
    }
}
