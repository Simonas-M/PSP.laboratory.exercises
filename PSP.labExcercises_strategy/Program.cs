using System.Collections.Generic;
using PSP.labExercises_strategy;
using PSP.labExercises_strategy.Recipes;

namespace PSP.labExcercises_strategy
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Step> pancakeSteps = new List<Step>
            {
                new Step{Definition="Put all ingredients into a bowl", Duration= 3},
                new Step{Definition="Mix ingredients", Duration= 3},
                new Step{Definition="Heat pan", Duration= 3}
            };
            IRecipe pancake = new PancakeRecipe(pancakeSteps);
            pancake.MakeFood();
        }
    }
}
