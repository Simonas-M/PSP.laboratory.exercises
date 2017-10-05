using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PSP.labExercises_template
{
    class FastFoodPriceCalculator
    {
        public void GetPrice(IEnumerable<Step> steps)
        {
            decimal price = steps.Sum(step => step.Cost);
            int time = steps.Where(step => steps.ElementAt(0) == step || steps.ElementAt(1) == step).Sum(x => x.Duration);
            Console.WriteLine($"Price of Fast Food Pizza is {price * 0.1M * time}");
        }
    }
}
