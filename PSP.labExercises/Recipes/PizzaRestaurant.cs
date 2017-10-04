using System;
using System.Collections.Generic;
using System.Linq;

namespace PSP.labExercises_template.Recipes
{
    class PizzaRestaurant : Recipe
    {
        public PizzaRestaurant(IEnumerable<Step> steps) : base(steps) { }

        protected override void Finally()
        {
            Console.WriteLine("Cooking pizza in the oven");
        }

        protected override void Execute(Step step)
        {
            Console.WriteLine($"Do \"{step.Definition}\" the Italian way for {step.Duration} minutes");
        }

        protected override void PrepareIngredients()
        {
            Console.WriteLine("Get Mozzarela");
            Console.WriteLine("Get Tomato sauce");
            Console.WriteLine("Get Jelapeno");
            Console.WriteLine("Get pizza daugh");
        }

        protected override void GetPrice()
        {
            decimal price = Steps.Sum(x => x.Cost);
            int time = Steps.Sum(x => x.Duration);
            Console.WriteLine($"Price of Restaurant Pizza is {price * 0.1M * time}");
        }
    }
}
