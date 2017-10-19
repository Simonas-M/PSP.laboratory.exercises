using System;
using System.Collections.Generic;
using PSP.labExercises_strategy;
using System.Linq;

namespace PSP.labExcercises_strategy.Price_policies
{
    class FastFoodPrice : IPricePolicy
    {
        public void GetPrice(IEnumerable<Step> steps)
        {
            decimal price = steps.Sum(step => step.Cost);
            int time = steps
                .Where(step => steps.ElementAt(0) == step || steps.ElementAt(1) == step)
                .Sum(x => x.Duration);
            Console.WriteLine($"Price is {price * 0.1M * time}");
        }
    }
}
