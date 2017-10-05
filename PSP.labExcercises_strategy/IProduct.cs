using System.Collections.Generic;
using PSP.labExercises_strategy;

namespace PSP.labExcercises_strategy
{
    interface IProduct
    {
        void PrepareIngredients();

        void Execute(Step step);

        void Finally();
    }
}