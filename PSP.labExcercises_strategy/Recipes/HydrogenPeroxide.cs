using System;
using System.Collections.Generic;
using PSP.labExcercises_strategy;

namespace PSP.labExercises_strategy.Recipes
{
    public class HydrogenPeroxide : IRecipeSteps
    {
        private IEnumerable<Step> _steps;

        public HydrogenPeroxide(IEnumerable<Step> steps)
        {
            _steps = steps;
        }

        public IEnumerable<Step> GetSteps()
        {
            return _steps;
        }

        public void Finally()
        {
            Console.WriteLine("Pass electric current through the solution");
        }

        public void Execute(Step step)
        {
            Console.WriteLine($"Do \"{step.Definition}\" scientifically for {step.Duration} minutes");
        }

        public void PrepareIngredients()
        {
            Console.WriteLine("Get the H20");
            Console.WriteLine("Get the Hydrolizer");
        }
    }
}
