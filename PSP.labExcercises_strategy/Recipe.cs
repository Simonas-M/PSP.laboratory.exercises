using PSP.labExercises_strategy;
using System.Collections.Generic;

namespace PSP.labExcercises_strategy
{
    class Recipe
    {
        private IProduct _product;
        private IPricePolicy _pricePolicy;
        private IEnumerable<Step> _steps;

        public Recipe(IProduct product, IPricePolicy pricePolicy, IEnumerable<Step> steps)
        {
            _product = product;
            _pricePolicy = pricePolicy;
            _steps = steps;
        }

        public void GetRecipe()
        {
            _product.PrepareIngredients();
            foreach (var step in _steps)
            {
                _product.Execute(step);
            }
            _product.Finally();
        }

        public void GetPrice()
        {
            _pricePolicy.GetPrice(_steps);
        }
    }
}
