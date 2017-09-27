﻿using PSP.labExercises_template.Recipes;
using System.Collections.Generic;

namespace PSP.labExercises_template
{
    public class Program
    {
        public static void Main(string[] args)
        {
            List<Step> pancakeSteps = new List<Step>
            {
                new Step{Definition="Put all ingredients into a bowl", Duration= 3},
                new Step{Definition="Mix ingredients", Duration= 3},
                new Step{Definition="Heat pan", Duration= 3}
            };
            Recipe pancake = new PancakeRecipe(pancakeSteps);
            pancake.MakeFood();
        }
    }
}