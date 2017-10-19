using System.Collections.Generic;

namespace PSP.labExercises_template
{
    abstract class Recipe
    {
        public IEnumerable<Step> Steps;

        public Recipe(IEnumerable<Step> steps)
        {
            Steps = steps;
        }

        public void GetRecipe()
        {
            PrepareIngredients();
            foreach(var step in Steps)
            {
                Execute(step);
            }
            Finally();
            GetPrice();
        }

        protected abstract void PrepareIngredients();

        protected abstract void Execute(Step step);

        protected abstract void Finally();

        protected abstract void GetPrice();
    }
}
