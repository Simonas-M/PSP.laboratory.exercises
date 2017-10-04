using System.Collections.Generic;
using PSP.labExercises_strategy;

namespace PSP.labExcercises_strategy
{
    public interface IRecipeSteps
    {
        IEnumerable<Step> GetSteps();

        void PrepareIngredients();

        void Execute(Step step);

        void Finally();
    }
}