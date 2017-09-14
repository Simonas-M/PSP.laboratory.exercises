using System;
using System.Collections.Generic;

namespace PSP.labExercises.Recipes
{
    class PancakeRecipe : Recipe
    {
        public PancakeRecipe(List<Step> steps) : base(steps) { }

        private void AddButter(int grams)
        {
            Console.WriteLine($"Adding {grams} grams of butter");
        }

        protected override void Cook()
        {
            AddButter(100);
            Console.WriteLine("Cooking pancakes in the pan");
        }

        protected override void Execute(Step step)
        {
            Console.WriteLine($"Doing: {step.Definition} the Lithuanian way");
        }

        protected override void PrepareIngredients()
        {
            Console.WriteLine("Get the eggs");
            Console.WriteLine("Get the milk");
            Console.WriteLine("Get the flour");
        }
    }
}
