using PSP.labExercises.Recipes;
using System.Collections.Generic;

namespace PSP.labExercises
{
    public class Program
    {
        public static void Main(string[] args)
        {
            List<Step> pancakeSteps = new List<Step>
            {
                new Step("Step1", 3),
                new Step("Step2", 4),
                new Step("Step3", 5)
            };
            Recipe pancake = new PancakeRecipe(pancakeSteps);
            pancake.MakeFood();

        }
    }
}