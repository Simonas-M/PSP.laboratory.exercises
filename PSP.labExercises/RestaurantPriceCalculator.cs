using System;
using System.Collections.Generic;
using System.Linq;

namespace PSP.labExercises_template
{
    class RestaurantPriceCalculator
    {
        public void GetPrice(IEnumerable<Step> steps)
        {
            decimal price = steps.Sum(step => step.Cost);
            int time = steps.Sum(step => step.Duration);
            Console.WriteLine($"Price of Restaurant Pizza is {price * 0.1M * time}");
        }
    }
}
