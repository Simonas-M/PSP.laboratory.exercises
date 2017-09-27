using System.Collections.Generic;

namespace PSP.labExercises_template
{
    abstract class Recipe
    {
        public List<Step> Steps = new List<Step>();

        public Recipe(List<Step> steps)
        {
            Steps = steps;
        }

        public void MakeFood()
        {
            PrepareIngredients();
            foreach(var step in Steps)
            {
                Execute(step);
            }
            Cook();
        }

        protected abstract void PrepareIngredients();

        protected abstract void Execute(Step step);

        protected abstract void Cook();
    }
}
