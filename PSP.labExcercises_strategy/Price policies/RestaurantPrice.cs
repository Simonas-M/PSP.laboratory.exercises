using System;
using System.Collections.Generic;
using PSP.labExercises_strategy;
using System.Linq;

namespace PSP.labExcercises_strategy.Price_policies
{
    class RestaurantPrice : IPricePolicy
    {
        public void GetPrice(IEnumerable<Step> steps)
        {
            decimal price = steps.Sum(x => x.Cost);
            int time = steps.Sum(x => x.Duration);
            Console.WriteLine($"Price is {price * 0.1M * time}");
        }
    }
}
