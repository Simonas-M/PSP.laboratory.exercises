using System;
using System.Collections.Generic;
using PSP.labExcercises_strategy;

namespace PSP.labExercises_strategy.Recipes
{
    class PancakeRecipe : IRecipe
    {
        private List<Step> Steps;

        public PancakeRecipe(List<Step> steps)
        {
            Steps = steps;
        }

        private void AddButter(int grams)
        {
            Console.WriteLine($"Adding {grams} grams of butter into the pan");
        }

        private void Cook()
        {
            AddButter(100);
            Console.WriteLine("Cooking pancakes in the pan");
        }

        private void Execute(Step step)
        {
            Console.WriteLine($"Doing: {step.Definition} the Lithuanian way for {step.Duration} minutes");
        }

        private void PrepareIngredients()
        {
            Console.WriteLine("Get the eggs");
            Console.WriteLine("Get the milk");
            Console.WriteLine("Get the flour");
            Console.WriteLine("Get the butter");
        }

        public void MakeFood()
        {
            PrepareIngredients();
            foreach (var step in Steps)
            {
                Execute(step);
            }
            Cook();
        }
    }
}
