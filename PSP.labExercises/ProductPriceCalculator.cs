using System;
using System.Collections.Generic;
using System.Linq;

namespace PSP.labExercises_template
{
    static class ProductPriceCalculator
    {
        public static void GetProductPrice(IEnumerable<Step> steps, string pricePolicy)
        {
            decimal price;
            int time;
            switch (pricePolicy.ToLower())
            {
                case "restaurant":
                    price = steps.Sum(step => step.Cost);
                    time = steps.Sum(step => step.Duration);
                    Console.WriteLine($"Price of Restaurant Pizza is {price * 0.1M * time}");
                    break;
                case "fast food":
                    price = steps.Sum(step => step.Cost);
                    time = steps.Where(step => steps.ElementAt(0) == step || steps.ElementAt(1) == step).Sum(x => x.Duration);
                    Console.WriteLine($"Price of Fast Food Pizza is {price * 0.1M * time}");
                    break;
                default:
                    Console.WriteLine($"Price calculation for {pricePolicy} is not implemented");
                    break;
            }
        }
    }
}
