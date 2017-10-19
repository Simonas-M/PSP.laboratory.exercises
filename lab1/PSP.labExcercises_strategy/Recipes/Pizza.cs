using System;
using System.Collections.Generic;
using PSP.labExercises_strategy;

namespace PSP.labExcercises_strategy.Recipes
{
    class Pizza : IProduct
    {
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
    }
}