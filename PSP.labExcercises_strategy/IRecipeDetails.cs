using System.Collections.Generic;
using PSP.labExercises_strategy;

namespace PSP.labExcercises_strategy
{
    interface IRecipeDetails
    {
        IEnumerable<Step> GetSteps();

        void PrepareIngredients();

        void Execute(Step step);

        void Finally();

        void GetPrice();
    }
}