using System;
using System.Collections.Generic;
using PSP.labExcercises_strategy;

namespace PSP.labExercises_strategy.Recipes
{
    class Pancake : IProduct
    {
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
