using PSP.labExercises_strategy;
using System.Collections.Generic;

namespace PSP.labExcercises_strategy
{
    interface IPricePolicy
    {
        void GetPrice(IEnumerable<Step> steps);
    }
}
