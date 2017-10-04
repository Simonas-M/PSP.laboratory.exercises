using System;
using System.Collections.Generic;
using PSP.labExcercises_strategy;

namespace PSP.labExercises_strategy.Recipes
{
    public class Pancake : IRecipeSteps
    {
        private IEnumerable<Step> _steps;

        public Pancake(List<Step> steps)
        {
            _steps = steps;
        }

        public IEnumerable<Step> GetSteps()
        {
            return _steps;
        }

        private void AddButter(int grams)
        {
            Console.WriteLine($"Add {grams} grams of butter into the pan");
        }

        public void Finally()
        {
            AddButter(100);
            Console.WriteLine("Cook pancakes in the pan");
        }

        public void Execute(Step step)
        {
            Console.WriteLine($"Do \"{step.Definition}\" the Lithuanian way for {step.Duration} minutes");
        }

        public void PrepareIngredients()
        {
            Console.WriteLine("Get the eggs");
            Console.WriteLine("Get the milk");
            Console.WriteLine("Get the flour");
            Console.WriteLine("Get the butter");
        }
    }
}
