﻿using System;
using System.Collections.Generic;
using System.Linq;

namespace PSP.labExercises_template.Recipes
{
    class CupcakeFastFood : Recipe
    {
        public CupcakeFastFood(IEnumerable<Step> steps) : base(steps) { }

        protected override void Finally()
        {
            Console.WriteLine("Bake cupcakes in the oven until brown");
        }

        protected override void Execute(Step step)
        {
            Console.WriteLine($"Do \"{step.Definition}\" the Swedish way for {step.Duration} minutes");
        }

        protected override void PrepareIngredients()
        {
            Console.WriteLine("Get the flour");
            Console.WriteLine("Get the eggs");
            Console.WriteLine("Get the butter");
            Console.WriteLine("Get the milk");
            Console.WriteLine("Get the pan");
        }

        protected override void GetPrice()
        {
            decimal price = Steps.Sum(step => step.Cost);
            int time = Steps.Where(step => Steps.ElementAt(0) == step || Steps.ElementAt(1) == step).Sum(x => x.Duration);
            Console.WriteLine($"Price of Fast Food cupcake is {price * 0.1M * time}");
        }
    }
}
