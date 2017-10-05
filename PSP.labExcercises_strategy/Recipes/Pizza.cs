using System;
using System.Collections.Generic;
using PSP.labExercises_strategy;

namespace PSP.labExcercises_strategy.Recipes
{
    class Pizza : IRecipeDetails
    {
        private IEnumerable<Step> _steps;
        private IPricePolicy _pricePolicy;

        public Pizza(IEnumerable<Step> steps, IPricePolicy pricePolicy)
        {
            _steps = steps;
            _pricePolicy = pricePolicy;
        }

        public void Finally()
        {
            Console.WriteLine("Cook pizza in the oven");
        }

        public void Execute(Step step)
        {
            Console.WriteLine($"Do \"{step.Definition}\" the Italian way for {step.Duration} minutes");
        }

        public void PrepareIngredients()
        {
            Console.WriteLine("Get Mozzarela");
            Console.WriteLine("Get Tomato sauce");
            Console.WriteLine("Get jelapeno");
            Console.WriteLine("Get pizza daugh");
        }

        public IEnumerable<Step> GetSteps()
        {
            return _steps;
        }

        public void GetPrice()
        {
            _pricePolicy.GetPrice(GetSteps());
        }
    }
}