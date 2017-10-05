using PSP.labExercises_strategy;
using System;
using System.Collections.Generic;

namespace PSP.labExcercises_strategy.Recipes
{
    class Cupcake : IProduct
    {
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
    }
}
